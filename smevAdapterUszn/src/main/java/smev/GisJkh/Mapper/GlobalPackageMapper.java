package smev.GisJkh.Mapper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.RowMapper;
import smev.GisJkh.Entity.GlobalPackageEntity;
import smev.utils.util;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.UUID;

public class GlobalPackageMapper implements RowMapper<GlobalPackageEntity> {

    private static final Logger log = LoggerFactory.getLogger("smev.GisJkh");

    @Override
    public GlobalPackageEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
        return GlobalPackageEntity.builder()
                .idGlobalPackage(UUID.fromString(rs.getString("idGlobalPackage")))
                .createDate(util.DatetoLocalDateTime(rs.getTimestamp("createDate")))
                .build();
    }
}
