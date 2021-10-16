package smev.Reestr.Service;

import smev.Dto.OrderInfoDto;
import smev.Dto.UserDto;
import smev.Entity.OrderFromReestr;
import smev.Enum.OrderInquiryState;
import smev.Enum.ProcessStatusOrder;
import smev.Enum.StatusOrder;
import smev.Reestr.Dto.DataRequestOrders;
import smev.Reestr.Dto.OrderDto;
import smev.Reestr.Dto.OrderInquiryDto;
import smev.dao.EntitySmev.OrderEntity;
import smev.dao.EntitySmev.OrderInquiryEntity;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public interface OrderService {
    void removeOrder(UUID orderId);

    OrderDto createOrder(OrderFromReestr orderFromReestr, Integer userId);

    void ParsingInteractionOrder(OrderInquiryDto orderInquiryDTO, UUID interactionId);

    List<OrderInquiryEntity> runSchedullerOrder(List<OrderInquiryEntity> list, UUID idOrder);

    void run();

    static int count(List<OrderInquiryEntity> list) {
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    static void orderState(OrderEntity oneOrder, List<OrderInquiryEntity> orderInquiryAll) {
        if (orderInquiryAll == null || orderInquiryAll.isEmpty()) {
            oneOrder.setStatusId(StatusOrder.UNKNOWN);
            return;
        }
        OrderInfoDto infoF = new OrderInfoDto();
        List<OrderInquiryEntity> errorInquiryOrderF = getError(orderInquiryAll);
        List<OrderInquiryEntity> successInquiryOrderF = getSuccess(orderInquiryAll);
        List<OrderInquiryEntity> processInquiryOrderF = getInWork(orderInquiryAll);
        List<OrderInquiryEntity> warningInquiryOrderF = getWarning(orderInquiryAll);
        List<OrderInquiryEntity> timeOutInquiryOrderF = getTimeOut(orderInquiryAll);

        infoF.setErrorNumber(count(errorInquiryOrderF));
        infoF.setProcessNumber(count(processInquiryOrderF));
        infoF.setSuccessNumber(count(successInquiryOrderF));
        infoF.setWarningNumber(count(warningInquiryOrderF));
        infoF.setTimeOutNumber(count(timeOutInquiryOrderF));


        if (infoF.getErrorNumber() + infoF.getSuccessNumber() + infoF.getTimeOutNumber() == orderInquiryAll.size()) {
            oneOrder.setProcessStatusOrder(ProcessStatusOrder.NOT_WORK);
        }

        if (infoF.getErrorNumber() > 0) {
            if (infoF.getErrorNumber() > 0 & infoF.getErrorNumber() == orderInquiryAll.size()) {
                oneOrder.setProcessStatusOrder(ProcessStatusOrder.NOT_WORK);
            }
            oneOrder.setStatusId(StatusOrder.ERROR);
            return;
        }

        if (infoF.getTimeOutNumber() > 0) {
            if (infoF.getTimeOutNumber() > 0 & infoF.getTimeOutNumber() == orderInquiryAll.size()) {
                oneOrder.setProcessStatusOrder(ProcessStatusOrder.NOT_WORK);
            }
            oneOrder.setStatusId(StatusOrder.WARNING);
            return;
        }

        if (infoF.getProcessNumber() > 0) {
            if (infoF.getSuccessNumber() > 0 & infoF.getSuccessNumber() == orderInquiryAll.size()) {
                oneOrder.setProcessStatusOrder(ProcessStatusOrder.NOT_WORK);
                oneOrder.setStatusId(StatusOrder.SUCCESS);
                return;
            }
            oneOrder.setStatusId(StatusOrder.PROCESS);
            return;
        }
    }

    static List<OrderInquiryEntity> getWarning(List<OrderInquiryEntity> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (List<OrderInquiryEntity>) list.stream()
                .filter(orderInquiryEntity -> OrderInquiryState.WARNING.equals(orderInquiryEntity.getOrderInquiryState()))
                .collect(Collectors.toList());


    }

    static List<OrderInquiryEntity> getTimeOut(List<OrderInquiryEntity> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (List<OrderInquiryEntity>) list.stream()
                .filter(orderInquiryEntity -> OrderInquiryState.TIME_OUT.equals(orderInquiryEntity.getOrderInquiryState()))
                .collect(Collectors.toList());


    }

    static List<OrderInquiryEntity> getInWork(List<OrderInquiryEntity> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (List<OrderInquiryEntity>) list.stream()
                .filter(orderInquiryEntity -> OrderInquiryState.IN_WORK.equals(orderInquiryEntity.getOrderInquiryState()))
                .collect(Collectors.toList());

    }

    static List<OrderInquiryEntity> getSuccess(List<OrderInquiryEntity> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (List<OrderInquiryEntity>) list.stream()
                .filter(orderInquiryEntity -> OrderInquiryState.SUCCESS.equals(orderInquiryEntity.getOrderInquiryState()))
                .collect(Collectors.toList());

    }

    static List<OrderInquiryEntity> getNotSuccess(List<OrderInquiryEntity> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (List<OrderInquiryEntity>) list.stream()
                .filter(orderInquiryEntity -> !OrderInquiryState.SUCCESS.equals(orderInquiryEntity.getOrderInquiryState()))
                .filter(orderInquiryEntity -> !OrderInquiryState.TIME_OUT.equals(orderInquiryEntity.getOrderInquiryState()))
                .collect(Collectors.toList());

    }

    static List<OrderInquiryEntity> getError(List<OrderInquiryEntity> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (List<OrderInquiryEntity>) list.stream()
                .filter(orderInquiryEntity -> OrderInquiryState.ERROR.equals(orderInquiryEntity.getOrderInquiryState()))
                .collect(Collectors.toList());

    }

    List<OrderDto> orders(UserDto user, DataRequestOrders reqData);

    List<OrderInquiryDto> orderInquirys(UUID orderId);

    byte[] getPdfByOrderId(UUID orderId) throws Exception;
}
