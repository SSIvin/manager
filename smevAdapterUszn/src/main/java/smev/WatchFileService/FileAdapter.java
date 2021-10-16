package smev.WatchFileService;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import smev.WatchFileStrategy.Enum.FileTypeInDirectories;
import smev.WatchFileStrategy.FileReader;
import smev.WatchFileStrategy.defaultStrategyFile;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@Service
public class FileAdapter implements FileListener {

    @Override
    public void onCreated(FileEvent event, FileTypeInDirectories oneTypeFile) {
        FileReader strategy = getStrategy(event.getFile(), oneTypeFile);
        log.info("файл {} в обработке", event.getFile().getAbsolutePath());
        strategy.readFile(event.getFile());
    }
    @Override
    public void onModified(FileEvent event, FileTypeInDirectories oneTypeFile) {
        FileReader strategy = getStrategy(event.getFile(), oneTypeFile);
//        при удалении файла генерируется событие onModified. поэтому надо проверять на наличие файла
        if(event.getFile().exists() && !event.getFile().isDirectory()) {
            log.info("файл {} после модификации в обработке", event.getFile().getAbsolutePath());
            strategy.readFile(event.getFile());
        }
    }
    @Override
    public void onDeleted(FileEvent event) {
        //реализация не предусмотрена
    }

    @Override
    public void onOverFlow(FileEvent event) {
        log.info(event.getFile().getName());
    }

    private Map<String, FileReader> map;

    public FileAdapter() {
    }

    @Autowired
    public FileAdapter(List<FileReader> map000) {
        Map<String, FileReader> result = new HashMap<>();
        for (FileReader o : map000) {
            result.putIfAbsent(o.getTypeFile().name().toUpperCase(), o);
        }
        this.map = result;

    }

    public FileReader getStrategy(File fileName, FileTypeInDirectories oneTypeFile){
        FileTypeInDirectories fileTypeInDirectories = getTypeFileByNameOrInto(fileName, oneTypeFile);
        return this.map.getOrDefault(fileTypeInDirectories.name().toUpperCase(), new defaultStrategyFile());
    }

    private FileTypeInDirectories getTypeFileByNameOrInto(File fileName, FileTypeInDirectories oneTypeFile) {
        if (!oneTypeFile.equals(FileTypeInDirectories.ALL)) {
            return oneTypeFile;
        } else {
//            тип файла определяем по внутреностям файла
            return null;
        }
    }

}
