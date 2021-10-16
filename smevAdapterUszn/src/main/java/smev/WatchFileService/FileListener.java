package smev.WatchFileService;

import smev.WatchFileStrategy.Enum.FileTypeInDirectories;

import java.util.EventListener;

public interface FileListener extends EventListener {
    public void onCreated(FileEvent event, FileTypeInDirectories oneTypeFile);
    public void onModified(FileEvent event, FileTypeInDirectories oneTypeFile);
    public void onDeleted(FileEvent event);
    public void onOverFlow(FileEvent event);
}
