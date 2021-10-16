package smev.config;

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
public class WebConfig {
    /****************************************************************/


    @Bean(name = "egissodbNamedSource")
    @ConfigurationProperties(prefix = "egissodbnamed")
    public DataSource egissodbNamedSource() {
        return  DataSourceBuilder.create().build();
    }



    @Bean(name = "egissojdbcNamed")
    public NamedParameterJdbcTemplate egissojdbcNamed(@Qualifier("egissodbNamedSource") DataSource ds) {
        return new NamedParameterJdbcTemplate(ds);


    }

    @Bean(name="egissojdbcNamedTransactionManager")
    DataSourceTransactionManager egissojdbcNamedTransactionManager(@Qualifier ("egissodbNamedSource") DataSource datasource) {
        DataSourceTransactionManager txm  = new DataSourceTransactionManager(datasource);
        return txm;
    }

    //----------------FRI-----------------------------
    @Bean(name = "fridbNamedSource")
    @ConfigurationProperties(prefix = "fridbnamed")
    public DataSource fridbNamedSource() {
        return  DataSourceBuilder.create().build();
    }

    @Bean(name = "jdbcFriNamed")
    public NamedParameterJdbcTemplate jdbcFriNamed(@Qualifier("fridbNamedSource") DataSource ds) {
        return new NamedParameterJdbcTemplate(ds);
    }

    @Bean(name="jdbcFriTransactionManager")
    DataSourceTransactionManager jdbcFriTransactionManager(@Qualifier ("fridbNamedSource") DataSource datasource) {
        DataSourceTransactionManager txm  = new DataSourceTransactionManager(datasource);
        return txm;
    }
//    ----------------------------------------------------

//    //---------------GIS JKH------------------------------
//    @Bean(name = "gisjkhdbNamedSource")
//    @ConfigurationProperties(prefix = "gisjkhdbnamed")
//    public DataSource gisjkhdbNamedSource() {
//        return  DataSourceBuilder.create().build();
//    }
//
//    @Bean(name = "jdbcGisJkhNamed")
//    public NamedParameterJdbcTemplate jdbcGisJkhNamed(@Qualifier("gisjkhdbNamedSource") DataSource ds) {
//        return new NamedParameterJdbcTemplate(ds);
//    }
//
//    @Bean(name="jdbcGisJkhTransactionManager")
//    DataSourceTransactionManager jdbcGisJkhTransactionManager(@Qualifier ("gisjkhdbNamedSource") DataSource datasource) {
//        DataSourceTransactionManager txm  = new DataSourceTransactionManager(datasource);
//        return txm;
//    }
////    ----------------------------------------------------

//    перевел в отдельный class по аналогии с gisJkh
//    @Bean(name = "reestrdbNamedSource")
//    @ConfigurationProperties(prefix = "reestrdbnamed")
//    public DataSource reestrdbNamedSource() {
//        DataSource build = DataSourceBuilder
//                .create()
//               // .type(ComboPooledDataSource.class)
//                .type(HikariDataSource.class)
//                .build();
//        return build;
//    }

    /*Для каждого dataSource должен быть свой SqlSessionFactory */
//    @Bean
//    public SqlSessionFactory sqlSessionFactory2() throws Exception{
//        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
//        factoryBean.setDataSource(reestrdbNamedSource());
//
//        /*Для каждого dataSource свой путь к маперам*/
//        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
//        factoryBean.setMapperLocations(resolver.getResources("classpath:mybatisMapper/*Mapper.xml"));
//        return factoryBean.getObject();
//    }

    //    перевел в отдельный class по аналогии с gisJkh
//    @Bean(name = "jdbcReestrNamed")
//    public NamedParameterJdbcTemplate jdbcReestrNamed(@Qualifier("reestrdbNamedSource") DataSource ds) {
//        return new NamedParameterJdbcTemplate(ds);
//    }

    //    перевел в отдельный class по аналогии с gisJkh
//    @Bean(name="jdbcReestrTransactionManager")
//    DataSourceTransactionManager jdbcReestrTransactionManager(@Qualifier ("reestrdbNamedSource") DataSource datasource) {
//        DataSourceTransactionManager txm  = new DataSourceTransactionManager(datasource);
//        return txm;
//    }
    //    ----------------------------------------------------


    @Bean(name = "egissodbSource")
    @ConfigurationProperties(prefix = "egissodb")
    public DataSource egissodbSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "jdbcEgisso")
    public JdbcTemplate jdbcEgisso(@Qualifier("egissodbSource") DataSource ds) {
        return new JdbcTemplate(ds);
    }



    /******************************************************************/
    @Bean(name = "schedullerDBSource")
    @ConfigurationProperties(prefix = "schedullerdb")
    public DataSource schedullerDBSource() {
        return  DataSourceBuilder.create().build();
    }

    @Bean(name = "jdbcScheduller")
    public JdbcTemplate jdbcScheduller(@Qualifier("schedullerDBSource") DataSource ds) {
        return new JdbcTemplate(ds);
    }

    /****************************************************************/


    @Bean(name="jdbcEgissoTransactionManager")
    DataSourceTransactionManager jdbcEgissoTransactionManager(@Qualifier ("egissodbSource") DataSource datasource) {
        return new DataSourceTransactionManager(datasource);
    }

    @Bean(name="jdbcSchedullerTransactionManager")
    DataSourceTransactionManager jdbcSchedullerTransactionManager(@Qualifier ("schedullerDBSource") DataSource datasource) {
        return new DataSourceTransactionManager(datasource);
    }

}
