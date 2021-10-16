package smev.dao;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import smev.ElementServices.Report.ReportStatSmev;
import smev.SQL_SMEV_REPORT;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;

@Repository
@Log4j2
public class SmevDaoReport {


    @Autowired
    @Qualifier("jdbcSmevNamed")
    private NamedParameterJdbcTemplate jdbcSmevNamed;


    public List<ReportStatSmev.rowStatSmev> GetDataReport(ReportStatSmev reportStatSmev) {
        try {
            reportStatSmev.setRowStatSmev(jdbcSmevNamed.query(SQL_SMEV_REPORT.getDataStatSmev
                    , new MapSqlParameterSource()
                            .addValue("dataBegin", reportStatSmev.getDateBegin(), Types.DATE)
                            .addValue("dataEnd", reportStatSmev.getDateEnd(), Types.DATE)
                            .addValue("ID_REGION", reportStatSmev.getOrgParam().getIdR(), Types.INTEGER)
                    , new RowMapper<ReportStatSmev.rowStatSmev>() {
                        @Override
                        public ReportStatSmev.rowStatSmev mapRow(ResultSet rs, int rowNum) throws SQLException {
                            return ReportStatSmev.rowStatSmev.builder()
                                    .nameQ(rs.getString("nameQ"))
                                    .kolReq(rs.getInt("kolReq"))
                                    .kolResp(rs.getInt("kolResp"))
                                    .build();
                        }
                    }
            ));
        } catch (
                EmptyResultDataAccessException e) {

        }
        return reportStatSmev.getRowStatSmev();

    }
}
