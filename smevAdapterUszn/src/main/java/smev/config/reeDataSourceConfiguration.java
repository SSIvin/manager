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
        entityManagerFactoryRef = "RJkhEntityManagerFactory",
        transactionManagerRef = "RgisJkhTransactionManager",
        basePackages = {"smev.Reestr.Repo"})
public class reeDataSourceConfiguration {
   // @Primary
    @Bean(name = "RgisJkhDataSourceProperties")
    @ConfigurationProperties("reestrjpa")
    public DataSourceProperties RgisJkhDataSourceProperties() {
        return new DataSourceProperties();
    }

   // @Primary
    @Bean(name = "RgisJkhDataSource")
    @ConfigurationProperties("reestrdb.configuration")
    public DataSource RgisJkhDataSource(@Qualifier("RgisJkhDataSourceProperties") DataSourceProperties reestrDataSourceProperties) {
        return reestrDataSourceProperties.initializeDataSourceBuilder()
                .type(HikariDataSource.class)
//                .type(ComboPooledDataSource.class)
                .build();
    }

    //@Primary
    @Bean(name = "RJkhEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean RJkhEntityManagerFactoryMethod(
             EntityManagerFactoryBuilder gisJkhEntityManagerFactoryBuilder,
            @Qualifier("RgisJkhDataSource") DataSource RgisJkhDataSource) {

        Map<String, String> primaryJpaProperties = new HashMap<>();
        primaryJpaProperties.put("hibernate.dialect", "org.hibernate.dialect.SQLServer2005Dialect");
        primaryJpaProperties.put("hibernate.hbm2ddl.auto", "none");

        return gisJkhEntityManagerFactoryBuilder
                .dataSource(RgisJkhDataSource)
                .packages("smev.Reestr.Entity")
                .persistenceUnit("RgisJkhDataSource")
                .properties(primaryJpaProperties)
                .build();
    }

//    @Primary
    @Bean(name = "RgisJkhTransactionManager")
    public PlatformTransactionManager transactionManager(
            @Qualifier("RJkhEntityManagerFactory") EntityManagerFactory RJkhEntityManagerFactory) {

        return new JpaTransactionManager(RJkhEntityManagerFactory);
    }
}
