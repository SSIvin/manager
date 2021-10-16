//package smev.Service.Executors;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//import smev.Reestr.Entity.SubjectReestr;
//import smev.Reestr.Service.ReestrService;
//
//import java.util.Queue;
//
//public class jobExecutor implements Runnable {
//
//    private Queue<SubjectReestr> queue;
//
//    @Autowired
//    private ReestrService reestrService;
//
//    public jobExecutor(Queue<SubjectReestr> queue) {
//        this.queue = queue;
//    }
//
//    @Override
//    public void runReceive() {
//        SubjectReestr item = null;
//        while ((item = queue.poll()) != null) {
//            log.info(Thread.currentThread().getId());
//            //log.info(item.toString());
//            reestrService.getPaySubject(item);
//        }
//
//    }
//}
