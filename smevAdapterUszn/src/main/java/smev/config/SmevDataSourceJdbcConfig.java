package smev.config;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

@Configuration
public class SmevDataSourceJdbcConfig {

    @Bean(name = "smevdbSource")
    @ConfigurationProperties(prefix = "smevdb")
    public DataSource smevdbSource() {
        return  DataSourceBuilder
                .create()
                // .type(HikariDataSource.class)
                .build();
    }

    @Primary
    @Bean(name = "smevdbNamedSourceProperties")
    @ConfigurationProperties("smevdbnamed")
    public DataSourceProperties puvDataSourceProperties() {
        return new DataSourceProperties();
    }


    @Primary
    @Bean(name = "smevdbNamedSource")
    @ConfigurationProperties(prefix = "smevdbnamed.configuration")
    public DataSource smevdbNamedSource(@Qualifier("smevdbNamedSourceProperties") DataSourceProperties puvDataSourceProperties) {
        return  puvDataSourceProperties
                .initializeDataSourceBuilder()
//                .type(ComboPooledDataSource.class)
                .type(HikariDataSource.class)
                .build();
    }

    @Bean(name = "jdbcSmev")
    public JdbcTemplate jdbcSmev(@Qualifier("smevdbSource") DataSource ds) {
        return new JdbcTemplate(ds);
    }


    @Bean(name = "jdbcSmevNamed")
    public NamedParameterJdbcTemplate jdbcSmevNamed(@Qualifier("smevdbNamedSource") DataSource ds) {
        return new NamedParameterJdbcTemplate(ds);
    }


    @Bean(name="jdbcSmevTransactionManager")
    DataSourceTransactionManager jdbcSmevTransactionManager(@Qualifier ("smevdbSource") DataSource datasource) {
        DataSourceTransactionManager txm  = new DataSourceTransactionManager(datasource);
        return txm;
    }

    @Bean(name="jdbcSmevNamedTransactionManager")
    DataSourceTransactionManager jdbcSmevNamedTransactionManager(@Qualifier ("smevdbNamedSource") DataSource datasource) {
        DataSourceTransactionManager txm  = new DataSourceTransactionManager(datasource);
        return txm;
    }

}
