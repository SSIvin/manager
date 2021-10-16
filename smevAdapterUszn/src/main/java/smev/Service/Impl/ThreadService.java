package smev.Service.Impl;


import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import smev.Reestr.Entity2.SubjectReestr;

import java.util.List;

@Service
@Log4j2
public class ThreadService {


//    private static final Logger log = LogManager.getLogger("FILE-thread");

    public static final int poolSize = 100;

    public static final int batchSize = 1500;

//    private ExecutorService executor;

//    @Autowired
//    private SubjectReestrDao reestrMapper;

//    @Autowired
//    private HistoryPayDao historyPayDao;



//    @Autowired
//    private ReestrService reestrService;

//    public class jobExecutor implements Runnable {
//
//        private Queue<SubjectReestr> queue;
//
//        public jobExecutor(Queue<SubjectReestr> queue) {
//            this.queue = queue;
//        }
//
//        @Override
//        public void runReceive() {
//            SubjectReestr item = null;
//            while ((item = queue.poll()) != null) {
//                //log.info(Thread.currentThread().getId());
//                //log.info(item.toString());
//                reestrService.getPaySubject(item);
//            }
//
//        }
//    }


    public void testThread() {

        //List<SubjectReestr> reestrList1 = reestrMapper.selectAll();
        log.info("info");
        log.warn("warn");
        log.error("error");
        log.debug("debug");
        log.trace("trace");

        return;
/*
        //reestrMapper.selectByPrimaryKey(ss);
        //log.info(all);
        List<SubjectReestr> reestrList = reestrService.getListForJob();
        log.info("Запуск потоков для обработки " + reestrList.size() + " записей....");
        this.executor = Executors.newFixedThreadPool(poolSize);
        Queue<SubjectReestr> queue = new ConcurrentLinkedQueue<>();
        queue.addAll(reestrList);
        List<Future<?>> task = new ArrayList<>();
        for (int i = 0; i < poolSize; i++) {
            Future<?> submit = executor.submit(() -> {
                final Thread currentThread = Thread.currentThread();
                final String oldName = currentThread.getName();
                List<SubjectReestr> listAll = new ArrayList<>();
                SubjectReestr item = null;
                while ((item = queue.poll()) != null) {
                    currentThread.setName("Обработка дела-" + item.getIdR() + item.getIdSubject());
                    //log.info(Thread.currentThread().getId());
                    //log.info(item.toString());
                    HistoryPay historyPay = historyPayDao.selectTop1ByidSubject(new HistoryPayKey(null, item.getIdR(), item.getIdSubject()));
//                    if (historyPay != null) {
//                        reestrMapper.insert(new SubjectReestr(historyPay.getIdR(), historyPay.getIdSubject(), "", "", "", historyPay.getSnazn().toString()));
//                    }

                    reestrService.getPaySubject(item);
                    //reestrService.saveToOtherTable(item);
                    if (historyPay != null) {
                        listAll.add(new SubjectReestr(historyPay.getIdR(), historyPay.getIdSubject(), "", "", "", historyPay.getSnazn().toString()));
                    }

                    //listAll.add(item);


//
//                    try {
//                        //reestrService.getPaySubject(item);
//                        //reestrService.saveToOtherTable(item);
//                    } catch (Exception e) {
//                        executor.shutdownNow();
//                        try {
//                            throw new ExecutionException(e.getMessage(), e.getCause());
//                        } catch (ExecutionException e1) {
//                            e1.printStackTrace();
//                        }
//                        break;
//                    } finally {
//                        currentThread.setName(oldName);
//                    }

                }

                log.info(Thread.currentThread().getId() + ":" + listAll.size());
                for (int j = 0; j < listAll.size(); j += batchSize) {
                    insertBatch(listAll, j);
                }

            });
            task.add(submit);

//            executor.submit(new jobExecutor(queue));
        }
        for (Future<?> f : task) {
            try {
                f.get();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
        log.info("ThreadService shutdown");
        executor.shutdown();
//        try {
//            executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
//
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }*/
    }

    private void insertBatch(List<SubjectReestr> listAll, int j) {
        final List<SubjectReestr> batchList = listAll.subList(j, j + batchSize > listAll.size() ? listAll.size() : j + batchSize);
        //reestrService.saveToOtherTableBatch(batchList);
//        reestrMapper.Batchinsert(batchList);
    }
}
