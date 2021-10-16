package smev.FtpSmev;

import lombok.extern.log4j.Log4j2;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPReply;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
@Log4j2
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class FtpSmev {

    @Value("${ftpSmev.server}")
    private String server;

    @Value("${ftpSmev.login}")
    private String login;

    @Value("${ftpSmev.password}")
    private String password;

    @Value("${ftpSmev.connectTimeout}")
    private String connectTimeout;

    private FTPClient ftp;

    public void open() throws IOException {
        ftp = new FTPClient();
        ftp.setConnectTimeout(Integer.parseInt(connectTimeout));
        ftp.connect(server, 21);
        int reply = ftp.getReplyCode();
        if (!FTPReply.isPositiveCompletion(reply)) {
            ftp.disconnect();
            throw new IOException("Exception in connecting to FTP Server");
        }
        ftp.login(login, password);
    }

    public void close() throws IOException {
        ftp.disconnect();
    }
}
