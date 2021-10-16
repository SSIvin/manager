package fileWatchTest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import smev.SmevApplication;
import smev.WatchFileService.FileAdapter;
import smev.WatchFileService.FileEvent;
import smev.WatchFileService.FileWatcher;
import smev.WatchFileStrategy.Enum.FileTypeInDirectories;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SmevApplication.class) //Application being your
@SpringBootTest
@TestPropertySource("/application.properties")
public class WatchFileTest {

    private static final Logger log = LogManager.getLogger();


    @Test
    public void watchFile() throws Exception {
//        File folder = new File("C:\\15");
//        final Map<String, String> map = new HashMap<>();
//        FileWatcher watcher = new FileWatcher(folder);
//        watcher.addListener(new FileAdapter() {
//            @Override
//            public void onCreated(FileEvent event, FileTypeInDirectories oneTypeFile) {
//                //super.onCreated(event);
//                log.info(event.getFile().getName());
//            }
//        });
    }
}
