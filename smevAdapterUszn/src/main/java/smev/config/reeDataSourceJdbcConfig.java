package smev.config;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

@Configuration
public class reeDataSourceJdbcConfig {

    @Bean(name = "reestrdbSource")
    @ConfigurationProperties(prefix = "reestrdb")
    public DataSource reestrdbSource() {
        return  DataSourceBuilder
                .create()
                // .type(HikariDataSource.class)
                .build();
    }

    @Bean(name = "RdbNamedSource")
    @ConfigurationProperties(prefix = "reestrdbnamed")
    public DataSource RdbNamedSource() {
        DataSource build = DataSourceBuilder
                .create()
                .type(HikariDataSource.class)
                .build();
        return build;
    }


    @Bean(name = "jdbcReestr")
    public JdbcTemplate jdbcReestr(@Qualifier("reestrdbSource") DataSource ds) {
        return new JdbcTemplate(ds);
    }


    @Bean(name = "jdbcRNamed")
    public NamedParameterJdbcTemplate jdbcRNamed(@Qualifier("RdbNamedSource") DataSource ds) {
        return new NamedParameterJdbcTemplate(ds);
    }

    @Bean(name="jdbcReestrTransactionManager")
    DataSourceTransactionManager jdbcReestrTransactionManager(@Qualifier ("reestrdbSource") DataSource datasource) {
        DataSourceTransactionManager txm  = new DataSourceTransactionManager(datasource);
        return txm;
    }

    @Bean(name="jdbcRTransactionManager")
    DataSourceTransactionManager jdbcReestrNamedTransactionManager(@Qualifier("RdbNamedSource") DataSource datasource) {
        DataSourceTransactionManager txm  = new DataSourceTransactionManager(datasource);
        return txm;
    }
    //    ----------------------------------------------------

}
