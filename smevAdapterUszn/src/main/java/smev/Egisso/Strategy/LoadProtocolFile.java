package smev.Egisso.Strategy;


import lombok.extern.log4j.Log4j2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.xml.sax.InputSource;
import smev.Egisso.Elements.ElementsProtocol.Response;
import smev.Egisso.Service.Impl.ProtocolService;
import smev.Egisso.dto.PacInner;
import smev.Egisso.util.MyUtils;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.Files.isRegularFile;
import static java.nio.file.Files.newDirectoryStream;

@Component("loadfile")
@Log4j2
public class LoadProtocolFile implements LoadProtocolStrategy {


    @Autowired
    ProtocolService protocolService;

    @Value("${egisso.pathProtocol}")
    private String pathProtocol;

    public LoadProtocolFile() {
    }

    @Override
    public void Load() throws IOException {
        DirectoryStream<Path> directoryStream = newDirectoryStream(Paths.get(pathProtocol), "*.xml");
        for (Path path : directoryStream) {
            if (isRegularFile(path)) {
                PacInner pacInner = PacInner.builder().build();
                log.info("получение данных из файла " + path.getFileName());
                InputSource is = new InputSource(new FileInputStream(path.toAbsolutePath().toString()));
                Response responseProtocol = MyUtils.getResponseProtocol(is);
                pacInner.setProtocol(responseProtocol.getProtocol());
                pacInner.setGuidFile(responseProtocol.getProtocol().getPackageResult().getPackageID());
                this.protocolService.ttt(pacInner);
            }
        }
        this.protocolService.moveProtocolFiles();
        log.info("Обработка протоколов файлов завершена.");
    }
}
