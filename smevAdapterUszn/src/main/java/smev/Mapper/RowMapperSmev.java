package smev.Mapper;

import org.springframework.jdbc.core.RowMapper;
import smev.Dto.row;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RowMapperSmev implements RowMapper<row> {
    @Override
    public row mapRow(ResultSet rs, int rowNum) throws SQLException {
        row build = row.builder()
                .id(rs.getString("id"))
                .content(rs.getString("content"))
                .uid(rs.getInt("uid"))
                .build();
        return build;
    }
}
