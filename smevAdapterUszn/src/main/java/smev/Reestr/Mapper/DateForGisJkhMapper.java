package smev.Reestr.Mapper;

import org.springframework.jdbc.core.RowMapper;
import smev.Reestr.Dto.DateForGisJkh;
import smev.utils.util;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DateForGisJkhMapper implements RowMapper<DateForGisJkh> {
    @Override
    public DateForGisJkh mapRow(ResultSet rs, int rowNum) throws SQLException {
        return DateForGisJkh.builder()
                .date33(util.DatetoLocalDateTime(rs.getTimestamp("DATE_33")).toLocalDate())
                .date79(util.DatetoLocalDateTime(rs.getTimestamp("DATE_79")).toLocalDate())
                .build();
    }
}
