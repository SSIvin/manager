package smev.Service;

import smev.Dto.MessageSettingsDto;
import smev.Entity.MessageSettingsEntity;

import java.util.List;
import java.util.UUID;

public interface MessageSettingsService {

  MessageSettingsDto save(MessageSettingsDto paramMessageSettingsDto);

  MessageSettingsDto remove(UUID paramUUID);

  List<MessageSettingsDto> getByInquiryVersionId(UUID paramUUID);

  MessageSettingsDto getById(UUID paramUUID, boolean paramBoolean);
}

