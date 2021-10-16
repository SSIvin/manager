package smev.core;


import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import smev.dao.SmevDaoImpl;

import javax.annotation.PostConstruct;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Log4j2
@Component("database")
public final class DatabaseIntegrationModule extends AbstractExecutable {

    @Autowired
    private SmevDaoImpl smevDao;

    @Autowired
    private Fff fff;


    private ExecutorService executor;

    private final Set<DatabaseExecutable> executables = new HashSet<>();


    DatabaseIntegrationModule() {
        this.executor = Executors.newCachedThreadPool();
    }

    @PostConstruct
    private void postConstruct() {
        log.debug("initialized");
    }


    public void run() {
        start();

        DatabaseExecutable executable = new DatabaseExecutable(this.fff);
        this.executables.add(executable);
        if (!executable.isRun()) {
            executable.start();
            this.executor.execute((Runnable) executable);
        }
    }


    public void stop() {
        super.stop();
        for (DatabaseExecutable executable : this.executables) {
            executable.stop();
        }
        this.executables.clear();
    }
}
