package smev.Egisso.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import smev.ElementServices.Egisso.ElementsKmsz.Person;

import java.util.List;

public class PersonRepo {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private final NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Autowired
    public PersonRepo(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(jdbcTemplate);
    }

    public List<Person> findAll() {
        List<Person> list = jdbcTemplate.query("SELECT top(10) id,f,i,o FROM person", (rs, i) ->
                new Person(rs.getLong("idMessage")
                        , rs.getString("f")
                        , rs.getString("i")
                        , rs.getString("o"))
        );
        return list;

    }
}
