package OrderTest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import smev.Enum.StatusOrder;
import smev.Reestr.Entity.SubjectEntity;
import smev.Reestr.Entity.SubjectEntityPK;
import smev.Reestr.Repo.SubjectRepo;
import smev.Reestr.Service.OrderService;
import smev.Service.BusinessService;
import smev.Service.CreateMessageService;
import smev.Service.ReceiveMessageService;
import smev.SmevApplication;
import smev.dao.EntitySmev.*;
import smev.dao.RepoSmev.*;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SmevApplication.class) //Application being your
@SpringBootTest
@TestPropertySource("/application.properties")
public class OrderTest {

    private static final Logger log = LogManager.getLogger();

    @Autowired
    private OrderRepo orderRepo;

    @Autowired
    private OrderInquiryRepo orderInquiryRepo;

    @Autowired
    private OrderInteractionRepo orderInteractionRepo;

    @Autowired
    private SubjectRepo subjectRepo;

    @Autowired
    private OrderTemplateRepo orderTemplateRepo;

    @Autowired
    private CreateMessageService createMessageService;

    @Autowired
    private DataSubjectRepo dataSubjectRepo;

    @Autowired
    private BusinessService businessService;

    @Autowired
    private OrderService orderService;

    @Autowired
    private ReceiveMessageService receiveMessageService;









    @Test
    //@Scheduled(fixedRate = 5000)
    public void scheduller() {
        try {
            orderService.getPdfByOrderId(UUID.fromString("C1DBB347-8345-4712-991D-B2804D47863A"));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        //log.info(map);
    }

    @Test
    public void run() {
       orderService.run();
    }

    @Test
    public void getOrder() {
        Optional<OrderEntity> byId = orderRepo.findById(UUID.fromString("C1DBB347-8345-4712-991D-B2804D47863A"));
        OrderEntity orderEntity = byId.get();
        log.info(orderEntity);
    }

    @Test
    public void getOrderInquiry() {
//        Optional<List<OrderInquiryEntity>> test1 = orderInquiryRepo.
//        OrderInquiryEntity orderEntity = test1.get().get(0);
//        log.info(orderEntity);
    }

    @Test
    public void CreateOrder() {
        OrderEntity order = new OrderEntity(UUID.randomUUID());
        SubjectEntity subject = subjectRepo.findById(new SubjectEntityPK(49144, 7)).orElseGet(() -> {
            return null;
        });
        order.setIdRegion(subject.getIdRegion());
        order.setIdSubject(subject.getIdSubject());
        order.setCreateDate(LocalDateTime.now());
        order.setChangeDate(LocalDateTime.now());
        order.setOrderType(1);
        order.setStatusId(StatusOrder.PROCESS);
        orderRepo.save(order);

        List<OrderTemplateEntity> listTemplate = orderTemplateRepo.findByOrderType(order.getOrderType()).orElseGet(() -> {
            List<OrderTemplateEntity> orderTemplateEntities = new ArrayList<>();
            return orderTemplateEntities;
        });

        List<SubjectEntity> list = new ArrayList<>();
        list.add(subject);
        List<OrderInquiryEntity> listOrdInq = new ArrayList<>();
        List<OrderInteractionEntity> orderInteractionEntities = new ArrayList<>();
        list.forEach(sub -> {
            listTemplate.forEach(orderTemplateEntity -> {
                OrderInquiryEntity s = new OrderInquiryEntity();
                s.setId(UUID.randomUUID());
                s.setIdRegion(sub.getIdRegion());
                s.setIdSubject(sub.getIdSubject());
                s.setOrderId(order.getId());
                s.setInquiryId(orderTemplateEntity.getInquiryId());
                listOrdInq.add(s);
                //OrderInteractionEntity oi = new OrderInteractionEntity();
                //oi.setId(UUID.randomUUID());
                //oi.setOrderInquiryId(s.getId());
                //orderInteractionEntities.add(oi);
            });
        });
        orderInquiryRepo.saveAll(listOrdInq);
        //orderInteractionRepo.saveAll(orderInteractionEntities);
    }

}
