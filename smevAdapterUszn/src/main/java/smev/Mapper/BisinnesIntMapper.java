package smev.Mapper;

import lombok.extern.log4j.Log4j2;
import org.springframework.jdbc.core.RowMapper;
import smev.dao.EntitySmev.BusinessInteractionEntity;
import smev.dao.EntitySmev.InquiryVersionEntity;
import smev.Enum.InteractionDirection;
import smev.Enum.InteractionState;
import smev.utils.util;

import java.sql.ResultSet;
import java.sql.SQLException;


@Log4j2
public class BisinnesIntMapper implements RowMapper<BusinessInteractionEntity> {


    @Override
    public BusinessInteractionEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
        return BusinessInteractionEntity.builder()
                .id(util.StringToUUID(rs.getString("ID")))
                .inquiryVersion(InquiryVersionEntity.builder().id(util.StringToUUID(rs.getString("INQUIRY_VERSION_ID"))).build())
                .user(rs.getInt("USER_ID"))
                .direction(InteractionDirection.valueOf(rs.getString("DIRECTION")))
                .state(InteractionState.valueOf(rs.getString("STATE")))
                .test(rs.getBoolean("TEST"))
                .subject(null)
                .messages(null)
                .creationDate(util.DatetoLocalDateTime(rs.getTimestamp("CREATION_DATE")))
                .build();
    }
}
