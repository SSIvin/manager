package smev.Reestr.Mapper;

import org.springframework.jdbc.core.RowMapper;
import smev.ElementServices.PFR_KSZN.responsePfrKszn;
import smev.Reestr.Entity2.Rekvezits;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ChangePFRKSZNMapper implements RowMapper<responsePfrKszn> {
    @Override
    public responsePfrKszn mapRow(ResultSet rs, int rowNum) throws SQLException {
        responsePfrKszn responsePfrKszn = new responsePfrKszn();
        responsePfrKszn.setNumZapis(rs.getInt("numZapis"));
        responsePfrKszn.setSnils(rs.getString("SNILS"));
        responsePfrKszn.setFirstName(rs.getString("SURNAME"));
        responsePfrKszn.setLastName(rs.getString("NAME"));
        responsePfrKszn.setSecName(rs.getString("SECNAME"));
        responsePfrKszn.setBithdate(rs.getDate("BIRTHDAY").toLocalDate());
        responsePfrKszn.setSrokS(rs.getDate("DateS").toLocalDate());
        responsePfrKszn.setSrokPo(rs.getDate("DatePo").toLocalDate());
        responsePfrKszn.setDatePay(rs.getDate("DAT9").toLocalDate());
        responsePfrKszn.setSumPay(rs.getBigDecimal("SUM9"));
        return responsePfrKszn;
    }
}
