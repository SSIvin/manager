package smev.Mapper;

import org.springframework.jdbc.core.RowMapper;
import smev.Entity.Subject;
import smev.utils.util;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SubjectMapper implements RowMapper<Subject> {
    @Override
    public Subject mapRow(ResultSet rs, int rowNum) throws SQLException {
        return Subject.builder()
                .ID_BASE(rs.getInt("ID_BASE"))
                .ID_REGION(rs.getInt("ID_REGION"))
                .ID_SUBJECT(rs.getInt("ID_SUBJECT"))
                .Surname(rs.getString("SURNAME"))
                .Name(rs.getString("NAME"))
                .Secname(rs.getString("SECNAME"))
                .birthDay(util.toLocalDate(rs.getDate("BIRTHDAY")))
                .build();
    }
}
