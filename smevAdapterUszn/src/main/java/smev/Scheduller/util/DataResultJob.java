package smev.Scheduller.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.quartz.JobExecutionException;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DataResultJob {

    String str;
    ServerResponseCode serverResponseCode;
    JobExecutionException jobExecutionException;


}
