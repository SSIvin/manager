package smev.Dto;

import lombok.Builder;
import lombok.Data;
import smev.Enum.InteractionDirection;
import smev.Enum.InteractionState;
import smev.utils.util;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Builder
public class LimitInteractionDto {


    private UUID id;
    private UUID inquiryVersion;
    private Integer userId;
    private String direction;
    private String state;
    private Boolean test;
    private LocalDateTime creationDate;


    public static LimitInteractionDto fillDto(ResultSet rs) {
        try {
            return LimitInteractionDto.builder()
                    .id(util.StringToUUID(rs.getString("ID")))
                    .inquiryVersion(util.StringToUUID(rs.getString("INQUIRY_VERSION_ID")))
                    .userId(rs.getInt("USER_ID"))
                    .direction(rs.getString("DIRECTION"))
                    .state(rs.getString("STATE"))
                    .test(rs.getBoolean("TEST"))
                    .creationDate(util.DatetoLocalDateTime(rs.getTimestamp("CREATION_DATE")))
                    .build();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
