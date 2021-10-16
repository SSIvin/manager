package smev.Scheduller.service;

import lombok.*;

import java.io.Serializable;
import java.nio.file.Path;

@Builder
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@Getter
@Setter
public class JobResult implements Serializable {
    private static final long serialVersionUID = 1948094618729805585L;
    private Path tmpFile;
    private int exitValue;

    @Override
    public String toString() {
        return "JobResult{" +
                "tmpFile=" + tmpFile +
                ", exitValue=" + exitValue +
                '}';
    }


}
