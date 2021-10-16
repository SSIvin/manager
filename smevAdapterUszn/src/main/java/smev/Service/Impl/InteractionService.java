package smev.Service.Impl;



import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import smev.Dto.*;
import smev.dao.EntitySmev.BusinessInteractionEntity;
import smev.dao.EntitySmev.BusinessMessageEntity;
import smev.Entity.UserEntity;
import smev.Enum.InteractionDirection;
import smev.Enum.InteractionState;
import smev.Enum.MessageState;
import smev.Service.BusinessService;
import smev.converters.InteractionConverter;
import smev.converters.MessageConverter;
import smev.exceptions.RsServiceException;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@Log4j2
public class InteractionService {



    @Autowired
    private BusinessService businessService;

    @Autowired
    private UserServiceImpl userService;

    public List<InteractionDto> getIncoming(UserDto userDto, DataRequestInteractions dataRequestInteractions) {
        UserEntity userEntity = this.userService.getByNameDomain(userDto.getUserName());
        List<BusinessInteractionEntity> interactions = this.businessService.getIncomingInteractions(InteractionDirection.INCOMING, userDto.getId(), dataRequestInteractions)
                .stream()
                .filter(s -> userEntity.getRoleView().stream()
                        .filter(roleView -> roleView.getInteractionDirection().equals(InteractionDirection.INCOMING))
                        .anyMatch(roleView -> roleView.getInteractionType().equals(s.getInquiryVersion().getInteractionType())))
                .collect(Collectors.toList());
        return InteractionConverter.MAPPER.entityListToDtoList(interactions);
    }


    public List<InteractionDto> getOutgoing(UserDto userDto, DataRequestInteractions dataRequestInteractions) {
        UserEntity userEntity = this.userService.getByNameDomain(userDto.getUserName());


//       List<LimitInteractionDto> list  = businessService.getLimitInteractionDtos(InteractionDirection.OUTGOING, userDto.getId(), dataRequestInteractions);

                //long startTime2 = System.currentTimeMillis();


       List<BusinessInteractionEntity> interactions =  this.businessService.getOutgoingInteractions(InteractionDirection.OUTGOING, userEntity.getId(), dataRequestInteractions);
//        List<BusinessInteractionEntity> interactions =  businessService.getData(list);//this.businessService.getOutgoingInteractions(InteractionDirection.OUTGOING, userEntity.getId(), dataRequestInteractions)
        List<BusinessInteractionEntity> result = new ArrayList<>();
        for (BusinessInteractionEntity businessInteractionEntity : interactions) {
            if (businessInteractionEntity != null) {
                if (!InteractionState.DELETED.equals(businessInteractionEntity.getState())) {
                    if (userEntity.getRoleView().stream()
                            .filter(roleView -> roleView.getInteractionDirection().equals(InteractionDirection.OUTGOING))
                            .anyMatch(roleView -> roleView.getInteractionType().equals(businessInteractionEntity.getInquiryVersion().getInteractionType()))) {
                        result.add(businessInteractionEntity);
                    }
                }
            }
        }
//        long endTime2 = System.currentTimeMillis();
//        long processingTime2 = endTime2 - startTime2;
//        log.info("getData = " + processingTime2);

        return InteractionConverter.MAPPER.entityListToDtoList(result);
    }

    public InteractionDto getInteraction(UUID id) {
        BusinessInteractionEntity interaction = this.businessService.getInteractionById(id);
        return InteractionConverter.MAPPER.entityToDto(interaction);
    }

    public List<MessageDto> getMessages(UUID interactionId) {
        List<BusinessMessageEntity> messages = this.businessService.getMessagesByInteractionId(interactionId);
        return MessageConverter.MAPPER.entityListToDtoList(messages);

    }

    public void removeInteraction(UUID interactionId, UserDto user) throws Exception {
        BusinessInteractionEntity interaction = this.businessService.getInteractionById(interactionId);
        if (!InteractionDirection.OUTGOING.equals(interaction.getDirection())) {
            throw new RsServiceException("Запрещено удалять входящие взаимодействия");
        }
        InteractionDto interactionDto = getInteraction(interactionId);
        if (interactionDto.getInfo() != null) {
            BusinessMessageEntity messageEntity = this.businessService.getMessageEntityByIdMessage(UUID.fromString(interactionDto.getInfo().getMessageId()), false);

            Set<RoleDto> roles = user.getRoles();
            if (roles.stream().anyMatch(roleDto -> roleDto.getId() == 2)) {
                if (messageEntity.getSendId() != null) {
                    this.businessService.deleteFromT_SEND(messageEntity.getSendId());
                }
            } else {
                if (!MessageState.DRAFT.equals(messageEntity.getState())) {
                    throw new RsServiceException("Запрещено удалять НЕ черновик!");
                }
            }


        }

        interaction.setState(InteractionState.DELETED);
        this.businessService.saveInteraction(interaction);
    }
}

