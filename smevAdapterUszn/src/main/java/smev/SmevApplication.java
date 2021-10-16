package smev;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;
import smev.WatchFileService.FileAdapter;
import smev.WatchFileService.FileEvent;
import smev.WatchFileService.FileWatcher;
import smev.core.DatabaseIntegrationModule;

import java.io.File;
import java.util.HashMap;
import java.util.Map;


@SpringBootApplication(exclude = JpaRepositoriesAutoConfiguration.class)
//@EnableAutoConfiguration(exclude = {MybatisAutoConfiguration.class})
@EnableScheduling
@Log4j2
//@ComponentScan(basePackages = {"smev.*"})
//@ComponentScan(basePackages = {"ru.uszn.scheduller.*"})
//@MapperScan("smev.Reestr.Mapper")
//@MappedTypes(SubjectReestr.class)
@EnableCaching
public class SmevApplication implements CommandLineRunner {

    @Autowired
    private ApplicationContext context;
//    private static final Logger log = LogManager.getLogger(SmevApplication.class);

    public static void main(String[] args) {

        String java = System.getProperty("java.home").replaceAll("\"", "");

        SpringApplication.run(SmevApplication.class, args);
        log.info("{}: {}", "java", java);
    }

    @Override
    public void run(String... args) throws Exception {
        DatabaseIntegrationModule bean = (DatabaseIntegrationModule) context.getBean("database");
       // bean.run();
    }
}
