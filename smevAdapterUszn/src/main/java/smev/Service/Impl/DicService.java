package smev.Service.Impl;


import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import smev.dao.SmevDao;

import java.util.Map;
import java.util.stream.Collectors;

@Service
@Log4j2
public class DicService {


    @Autowired
    private SmevDao smevDao;

    public Map<String,String> listInquiry() {
        return smevDao.getInquiryVersions().stream()
                .filter(inquiryVersionEntity -> inquiryVersionEntity.getEnable().equals(true))
                .collect(Collectors.toMap(o -> o.getId().toString(), o -> o.getDescription()));
    }

    public Map<String, String> getOrderType() {
        return smevDao.getOrderType();
    }
}
