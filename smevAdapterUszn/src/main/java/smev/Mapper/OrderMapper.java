package smev.Mapper;

import lombok.extern.log4j.Log4j2;
import org.springframework.jdbc.core.RowMapper;
import smev.Enum.InteractionDirection;
import smev.Enum.InteractionState;
import smev.Enum.ProcessStatusOrder;
import smev.Enum.StatusOrder;
import smev.dao.EntitySmev.BusinessInteractionEntity;
import smev.dao.EntitySmev.InquiryVersionEntity;
import smev.dao.EntitySmev.OrderEntity;
import smev.utils.util;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.UUID;


@Log4j2
public class OrderMapper implements RowMapper<UUID> {


    @Override
    public UUID mapRow(ResultSet rs, int rowNum) throws SQLException {
        return
                //OrderEntity.builder()
                util.StringToUUID(rs.getString("ID"));
//                .userId(rs.getInt("USER_ID"))
//                .idOrderEpgu(rs.getString("IdOrderEPGU"))
//                .orderDate(util.toLocalDate(rs.getDate("ORDER_DATE")))
//                .orderType(rs.getInt("ORDER_TYPE"))
//                .idRegion(rs.getInt("ID_REGION"))
//                .idSubject(rs.getInt("ID_SUBJECT"))
//                .createDate(util.DatetoLocalDateTime(rs.getTimestamp("CREATE_DATE")))
//                .changeDate(util.DatetoLocalDateTime(rs.getTimestamp("CHANGE_DATE")))
//                .statusId(StatusOrder.valueOf(rs.getString("STATUS_ID")))
//                .userId(rs.getInt("USER_ID"))
//                .processStatusOrder(ProcessStatusOrder.getStatusOrderById(rs.getInt("PROCESS_STATUS")))
//                .build();
    }
}
