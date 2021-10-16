package smev;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;
import smev.WatchFileService.FileAdapter;
import smev.WatchFileService.FileEvent;
import smev.WatchFileService.FileListener;
import smev.WatchFileService.FileWatcher;
import smev.WatchFileStrategy.Enum.FileTypeInDirectories;

import java.io.File;
import java.util.List;

@Log4j2
@Component
public class ManagerRunner implements CommandLineRunner {

    @Value("${spring.profiles.active}")
    public String profileActive;


    private final ConfigurableApplicationContext context;

    private FileAdapter fileAdapter;

    @Override
    public void run(String... args) throws Exception {

        registerDirectoryWatch();
        //log.info("Manager stop");
        //SpringApplication.exit(this.context, new ExitCodeGenerator[0]);
    }

    private void registerDirectoryWatch() {
//        if (!profileActive.equals("prod")) {
//            return;
//        }

        FileWatcher watcher = new FileWatcher(new File("f:\\FolderForProcessing\\PFR_KSZN\\"), FileTypeInDirectories.ADRESS_PFR);
//        FileWatcher watcher = new FileWatcher(new File("\\\\10.10.12.24\\for_Load\\"), FileTypeInDirectories.ADRESS_PFR);
        watcher.addListener(fileAdapter)
                .watch();
//        FileWatcher watcher2 = new FileWatcher(new File("C:\\16"), FileTypeInDirectories.ADRESS_PFR);
//        watcher2.addListener(fileAdapter)
//                .watch();
       watcher.changeDate();

    }


    public ManagerRunner(final ConfigurableApplicationContext context, final FileAdapter fileAdapter) {
        this.context = context;
        this.fileAdapter = fileAdapter;
    }
}
