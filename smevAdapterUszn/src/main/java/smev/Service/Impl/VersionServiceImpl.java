package smev.Service.Impl;


import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import smev.Service.VersionService;

import javax.annotation.PostConstruct;

@Service
@Log4j2
public class VersionServiceImpl implements VersionService {



    @Value("${build.version}")
    private String buildVersion;


    @PostConstruct
    private void initVersion() {
//        log.info("#################### Application name: " + appName);
        log.info("#################### Application version: " + buildVersion);
    }

    @Override
    public String getVersion() {
        return buildVersion;
    }
}
