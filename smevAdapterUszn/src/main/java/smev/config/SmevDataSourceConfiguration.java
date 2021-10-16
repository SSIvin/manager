package smev.config;


import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories
        (
        entityManagerFactoryRef = "SmevJpaEntityManagerFactory",
        transactionManagerRef = "SmevJpaTransactionManager",
        basePackages = {"smev.dao.RepoSmev"})
public class SmevDataSourceConfiguration {
   // @Primary
    @Bean(name = "SmevJpaDataSourceProperties")
    @ConfigurationProperties("smevjpa")
    public DataSourceProperties SmevJpaDataSourceProperties() {
        return new DataSourceProperties();
    }

   // @Primary
    @Bean(name = "SmevJpaDataSource")
    @ConfigurationProperties("smevdbjpa.configuration")
    public DataSource SmevJpaDataSource(@Qualifier("SmevJpaDataSourceProperties") DataSourceProperties reestrDataSourceProperties) {
        return reestrDataSourceProperties.initializeDataSourceBuilder()
                .type(HikariDataSource.class)
//                .type(ComboPooledDataSource.class)
                .build();
    }

    //@Primary
    @Bean(name = "SmevJpaEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean SmevJpaEntityManagerFactoryMethod(
             EntityManagerFactoryBuilder SmevJpaEntityManagerFactoryBuilder,
            @Qualifier("SmevJpaDataSource") DataSource SmevJpaDataSource) {

        Map<String, String> primaryJpaProperties = new HashMap<>();
        primaryJpaProperties.put("hibernate.dialect", "org.hibernate.dialect.SQLServer2005Dialect");
        primaryJpaProperties.put("hibernate.hbm2ddl.auto", "none");

        return SmevJpaEntityManagerFactoryBuilder
                .dataSource(SmevJpaDataSource)
                .packages("smev.dao.EntitySmev")
                .persistenceUnit("SmevJpaDataSource")
                .properties(primaryJpaProperties)
                .build();
    }

//    @Primary
    @Bean(name = "SmevJpaTransactionManager")
    public PlatformTransactionManager transactionManager(
            @Qualifier("SmevJpaEntityManagerFactory") EntityManagerFactory SmevJpaEntityManagerFactory) {

        return new JpaTransactionManager(SmevJpaEntityManagerFactory);
    }
}
