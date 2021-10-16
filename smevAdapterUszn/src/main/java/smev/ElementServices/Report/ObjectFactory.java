
package smev.ElementServices.Report;

import smev.Report.InteractionStatus;

import javax.xml.bind.annotation.XmlRegistry;


@XmlRegistry
public class ObjectFactory {

    public ObjectFactory() {
    }

    public ReportPrint createReportPrint() {
        return new ReportPrint();
    }

    public ReportStatSmev createReportStatSmev() {
        return new ReportStatSmev();
    }

    public OrgParam createOrgParam() {
        return new OrgParam();
    }

    public InteractionStatus createInteractionStatus() {
        return new InteractionStatus();
    }

//    public InteractionStatus.StatusReport() createInteractionStatusStatusReport() {
//        return new InteractionStatus.StatusReport();
//    }

}
