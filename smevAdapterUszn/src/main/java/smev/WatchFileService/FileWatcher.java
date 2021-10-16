package smev.WatchFileService;

import org.apache.commons.io.FileUtils;
import smev.WatchFileStrategy.Enum.FileTypeInDirectories;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import static java.nio.file.StandardWatchEventKinds.*;

public class FileWatcher implements Runnable {
    protected List<FileListener> listeners = new ArrayList<>();
    protected final File folder;
    protected static final List<WatchService> watchServices = new ArrayList<>();
    private FileTypeInDirectories oneTypeFile;
    public FileWatcher(File folder, FileTypeInDirectories oneTypeFile) {
        this.folder = folder;
        this.oneTypeFile = oneTypeFile;
    }

    public void changeDate() {
        Iterator it = FileUtils.iterateFiles(new File(this.folder.getAbsolutePath()), null, false);
        while(it.hasNext()){
            File next = (File) it.next();
            long currentTimeMillis = System.currentTimeMillis();
            next.setLastModified(currentTimeMillis);
//            File file = new File(next.getParent() + "\\f_" + next.getName());
//            next.renameTo(file);
        }
    }

    public void watch() {
        if (folder.exists()) {
            Thread thread = new Thread(this);
            thread.setDaemon(true);
            thread.start();
        }
    }
    @Override
    public void run() {
        try (WatchService watchService = FileSystems.getDefault().newWatchService()) {
            Path path = Paths.get(folder.getAbsolutePath());
            path.register(watchService, ENTRY_CREATE, ENTRY_MODIFY, ENTRY_DELETE, OVERFLOW);
            watchServices.add(watchService);
            boolean poll = true;
            while (poll) {
                poll = pollEvents(watchService);
            }
        } catch (IOException | InterruptedException | ClosedWatchServiceException e) {
            Thread.currentThread().interrupt();
        }
    }
    protected boolean pollEvents(WatchService watchService) throws InterruptedException {
        WatchKey key = watchService.take();
//        WatchKey key = watchService.poll(10, TimeUnit.SECONDS);
        Path path = (Path) key.watchable();
        for (WatchEvent<?> event : key.pollEvents()) {
            notifyListeners(event.kind(), path.resolve((Path) event.context()).toFile());
        }
        return key.reset();
    }
    protected void notifyListeners(WatchEvent.Kind<?> kind, File file) {
        FileEvent event = new FileEvent(file);
        if (kind == ENTRY_CREATE) {
            for (FileListener listener : listeners) {
                listener.onCreated(event, oneTypeFile);
            }
            if (file.isDirectory()) {
                new FileWatcher(file,this.oneTypeFile).setListeners(listeners).watch();
            }
        }
        else if (kind == ENTRY_MODIFY) {
            for (FileListener listener : listeners) {
                listener.onModified(event, oneTypeFile);
            }
        }
        else if (kind == ENTRY_DELETE) {

            for (FileListener listener : listeners) {
                listener.onDeleted(event);
            }
        } else if  (kind == OVERFLOW) {
            for (FileListener listener : listeners) {
                listener.onOverFlow(event);
            }
        }
    }
    public FileWatcher addListener(FileListener listener) {
        listeners.add(listener);
        return this;
    }
    public FileWatcher removeListener(FileListener listener) {
        listeners.remove(listener);
        return this;
    }
    public List<FileListener> getListeners() {
        return listeners;
    }
    public FileWatcher setListeners(List<FileListener> listeners) {
        this.listeners = listeners;
        return this;
    }
    public static List<WatchService> getWatchServices() {
        return Collections.unmodifiableList(watchServices);
    }
}
