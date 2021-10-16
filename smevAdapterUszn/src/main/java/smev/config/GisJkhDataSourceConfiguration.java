package smev.config;


import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
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
        entityManagerFactoryRef = "gisJkhEntityManagerFactory",
        transactionManagerRef = "gisJkhTransactionManager",
        basePackages = {"smev.GisJkh.Repo"})
public class GisJkhDataSourceConfiguration {
   // @Primary
    @Bean(name = "gisJkhDataSourceProperties")
    @ConfigurationProperties("gisjkhjpa")
    public DataSourceProperties gisJkhDataSourceProperties() {
        return new DataSourceProperties();
    }

   // @Primary
    @Bean(name = "gisJkhDataSource")
    @ConfigurationProperties("gisjkhjpa.configuration")
    public DataSource gisJkhDataSource(@Qualifier("gisJkhDataSourceProperties") DataSourceProperties reestrDataSourceProperties) {
        return reestrDataSourceProperties.initializeDataSourceBuilder()
                .type(HikariDataSource.class)
//                .type(ComboPooledDataSource.class)
                .build();
    }

    @Primary
    @Bean(name = "gisJkhEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean gisJkhEntityManagerFactoryMethod(
             EntityManagerFactoryBuilder gisJkhEntityManagerFactoryBuilder,
            @Qualifier("gisJkhDataSource") DataSource gisJkhDataSource) {

        Map<String, String> primaryJpaProperties = new HashMap<>();
        primaryJpaProperties.put("hibernate.dialect", "org.hibernate.dialect.SQLServer2005Dialect");
        primaryJpaProperties.put("hibernate.hbm2ddl.auto", "none");

        return gisJkhEntityManagerFactoryBuilder
                .dataSource(gisJkhDataSource)
                .packages("smev.GisJkh.Entity")
                .persistenceUnit("gisJkhDataSource")
                .properties(primaryJpaProperties)
                .build();
    }

//    @Primary
    @Bean(name = "gisJkhTransactionManager")
    public PlatformTransactionManager transactionManager(
            @Qualifier("gisJkhEntityManagerFactory") EntityManagerFactory gisJkhEntityManagerFactory) {

        return new JpaTransactionManager(gisJkhEntityManagerFactory);
    }
}
