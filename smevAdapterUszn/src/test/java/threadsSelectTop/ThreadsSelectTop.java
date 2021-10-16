package threadsSelectTop;

import lombok.extern.log4j.Log4j2;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import smev.Service.Impl.BusinessServiceImpl;
import smev.SmevApplication;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= SmevApplication.class) //Application being your
@SpringBootTest
@TestPropertySource("/application.properties")
@Log4j2
public class ThreadsSelectTop {

    public final Integer countThread = 10;

    private ExecutorService executor;

//    @Autowired
//    private SmevDaoImpl smevDao;

    @Autowired
    private BusinessServiceImpl businessService;


    @Test
    public void test() throws InterruptedException {

//        this.executor = Executors.newFixedThreadPool(countThread);
        this.executor = importerExecutorService();
//        this.executor = Executors.newCachedThreadPool();

        for(int i = 0; i < countThread; i++) {
            final AtomicInteger threadNumber = new AtomicInteger(1);
            //Thread.currentThread().setName("[thread "  + threadNumber.getAndIncrement() + "]");
            while (!executor.isShutdown()) {
                Thread.sleep(1000);
                executor.submit(()->{
                    //row row = null;
                        while(true) {

                            businessService.test();


                        }
                      //  Thread.sleep(1000);

                  //  log.info("sjfgdsjkhgjksdflsdlkf thread {} update" ,Thread.currentThread().getName());
//                try {
//                    Thread.sleep(5000);
//                  //  log.info("thread {} update id {}",Thread.currentThread().getName(), null);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                    while((row = smevDao.getrow()) != null) {
//                        smevDao.updateTest(row);
//                        log.info("thread {} update id {}",Thread.currentThread().getName(), row.getId());
//                    }

                });
            }
        }
        executor.shutdownNow();
    }

    public ExecutorService importerExecutorService() {
        return Executors.newFixedThreadPool(countThread, new ImporterThreadFactory());
    }

    private static class ImporterThreadFactory implements ThreadFactory {
        private final ThreadFactory defaultFactory = Executors.defaultThreadFactory();
        private final AtomicInteger threadNumber = new AtomicInteger(1);

        public Thread newThread(Runnable r) {
            Thread thread = this.defaultFactory.newThread(r);
            if (!thread.isDaemon()) {
                thread.setDaemon(true);
            }

            thread.setName("importer-executor-" + this.threadNumber.getAndIncrement());
            return thread;
        }
    }



}
