package smev.Mapper;

import org.springframework.jdbc.core.RowMapper;
import smev.dao.EntitySmev.InquiryVersionEntity;
import smev.Enum.InteractionType;
import smev.utils.util;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.UUID;

public class InquiryVersionMapper implements RowMapper<InquiryVersionEntity> {
    @Override
    public InquiryVersionEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
        return InquiryVersionEntity.builder()
                .id(UUID.fromString(rs.getString("ID")))
                .namespace(rs.getString("NAMESPACE"))
                .description(rs.getString("DESCRIPTION"))
                .version(rs.getString("VERSION"))
                .testMessage(rs.getBoolean("TEST_MESSAGE"))
                .interactionType(InteractionType.valueOf(rs.getString("INTERACTION_TYPE")))
                .personalSignature(rs.getBoolean("PERSONAL_SIGNATURE"))
                .creationDate(util.DatetoLocalDateTime(rs.getDate("CREATION_DATE")))
                .build();
    }
}
