package smev.Service.Impl;


import lombok.extern.log4j.Log4j2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import smev.Dto.MessageSettingsDto;
import smev.Entity.MessageSettingsEntity;
import smev.Service.BusinessService;
import smev.Service.MessageSettingsService;
import smev.converters.MessageSettingsConverter;
import smev.exceptions.RsServiceException;

import java.util.List;
import java.util.UUID;

@Service
@Log4j2
public class MessageSettingsServiceImpl implements MessageSettingsService {


    @Autowired
    private BusinessService businessService;

    @Override
    public List<MessageSettingsDto> getByInquiryVersionId(UUID inquiryVersionId) {
        List<MessageSettingsEntity> messageSettingsList = this.businessService.getMessageSettingsList(inquiryVersionId);
        return MessageSettingsConverter.MAPPER.entityListToDtoList(messageSettingsList);
    }

    @Override
    public MessageSettingsDto getById(UUID messageSettingsId, boolean paramBoolean) {
        return null;
        //return this.businessService.getMessageSettings(messageSettingsId, true);
    }

    @Override
    public MessageSettingsDto save(MessageSettingsDto messageSettings) {
        if (messageSettings.getRootElement() == null) {
            throw new RsServiceException("Корневой элемент не заполнен");
        }
        if (messageSettings.getSource() == null) {
            throw new RsServiceException("Тип не заполнен");
        }
        if (messageSettings.getMode() == null) {
            throw new RsServiceException("Вариант не заполнен");
        }
        //return this.businessService.saveMessageSettings(messageSettings);
        return null;
    }

    @Override
    public MessageSettingsDto remove(UUID messageSettingsId) {
       //return this.businessService.removeMessageSettings(messageSettingsId);
        return null;
    }


}

