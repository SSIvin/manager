package smev.WatchFileStrategy;

import lombok.extern.log4j.Log4j2;
import smev.WatchFileStrategy.Enum.FileTypeInDirectories;

import java.io.File;

@Log4j2
public class defaultStrategyFile implements FileReader {
    @Override
    public void readFile(File file) {
      log.info("чтение произвольного файла");
    }

    @Override
    public FileTypeInDirectories getTypeFile() {
        return FileTypeInDirectories.ALL;
    }
}
