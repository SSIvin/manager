package smev.ElementServices.Report;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import smev.Dto.ReportParamDto;
import smev.Enum.ReportEnum;
import smev.Report.CreateReportStrategy;
import smev.Report.DefaultCreateReportStrategy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Log4j2
public class ReportStrategyService {

    private Map<Integer, CreateReportStrategy> map;


    @Autowired
    public ReportStrategyService(List<CreateReportStrategy> createReportStrategies) {
        Map<Integer, CreateReportStrategy> result = new HashMap<>();
        for (CreateReportStrategy o : createReportStrategies) {
            if (result.put(o.getIndexReport(), o) != null) {
                throw new IllegalStateException("Duplicate key");
            }
        }
        map = result;
    }



    public String CreateReportOfStrategy(ReportEnum reportEnum, ReportParamDto reportParamDto) {
        CreateReportStrategy createReportStrategy = map.getOrDefault(reportEnum.index(), new DefaultCreateReportStrategy());
       return createReportStrategy.createReport(reportParamDto);

    }


}
