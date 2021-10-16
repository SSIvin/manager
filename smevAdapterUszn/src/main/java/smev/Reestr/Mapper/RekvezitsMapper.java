package smev.Reestr.Mapper;

import org.springframework.jdbc.core.RowMapper;
import smev.Reestr.Entity2.Rekvezits;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RekvezitsMapper implements RowMapper<Rekvezits> {
    @Override
    public Rekvezits mapRow(ResultSet rs, int rowNum) throws SQLException {
        return Rekvezits.builder()
                .idRegion(rs.getShort("ID_REGION"))
                .fullName(rs.getString("FULL_NAME"))
                .shortName(rs.getString("SHORT_NAME"))
                .build();
    }
}
