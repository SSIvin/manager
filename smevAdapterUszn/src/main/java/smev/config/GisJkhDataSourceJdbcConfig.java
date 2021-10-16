package smev.config;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

@Configuration
public class GisJkhDataSourceJdbcConfig {

    @Bean(name = "gisjkhdbNamedSource")
    @ConfigurationProperties(prefix = "gisjkhdbnamed")
    public DataSource gisjkhdbNamedSource() {
        DataSource build = DataSourceBuilder
                .create()
                .type(HikariDataSource.class)
                .build();
        return build;
    }


    @Bean(name = "jdbcGisJkhNamed")
    public NamedParameterJdbcTemplate jdbcGisJkhNamed(@Qualifier("gisjkhdbNamedSource") DataSource ds) {
        return new NamedParameterJdbcTemplate(ds);
    }

    @Bean(name="jdbcGisJkhTransactionManager")
    DataSourceTransactionManager jdbcReestrTransactionManager(@Qualifier("gisjkhdbNamedSource") DataSource datasource) {
        DataSourceTransactionManager txm  = new DataSourceTransactionManager(datasource);
        return txm;
    }
    //    ----------------------------------------------------

}
