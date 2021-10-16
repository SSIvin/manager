package smev.WatchFileStrategy;

import smev.WatchFileStrategy.Enum.FileTypeInDirectories;

import java.io.File;

public interface FileReader {

    void readFile(File file);

    FileTypeInDirectories getTypeFile();
}
