package smev.Egisso.Elements.ElementsNazn;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import smev.ElementServices.Egisso.ElementsKmsz.LocalMSZ;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement(name = "fact")
@XmlAccessorType (XmlAccessType.FIELD)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Fact
{

	@XmlElement(name = "ID", namespace = Namespaces.af)
	private String ID;

	@XmlElement(name = "OSZCode", namespace = Namespaces.af)
	private String OSZCode;

	@XmlElement(name = "MSZ_receiver", namespace = Namespaces.af)
	private MSZ_receiver msz_receiver;

	@XmlElementWrapper(name = "reason_persons", namespace = Namespaces.af)
	@XmlElement(name = "prsnInfo", namespace = Namespaces.prsn)
	private List<PrsnInfo> prsnInfoList;

	@XmlElement(name = "LMSZID", namespace = Namespaces.af)
	private String LMSZID;

	@XmlElement(name = "categoryID", namespace = Namespaces.af)
	private String categoryID;

	@XmlElement(name = "decision_date", namespace = Namespaces.af)
	private String decision_date;

	@XmlElement(name = "dateStart", namespace = Namespaces.af)
	private String dateStart;

	@XmlElement(name = "dateFinish", namespace = Namespaces.af)
	private String dateFinish;

	@XmlElement(name = "needsCriteria", namespace = Namespaces.af)
	private NeedsCriteria needsCriteria;

	@XmlElementWrapper(name = "assignment_info", namespace = Namespaces.af)
	@XmlElement(name = "monetary_form", namespace = Namespaces.af)
	private List<Monetary_form> monetary_form;

	@XmlElementWrapper(name = "assignment_info", namespace = Namespaces.af)
	@XmlElement(name = "exemptionForm", namespace = Namespaces.af)
	private List<ExemptionForm> exemptionForms;

	@XmlElementWrapper(name = "assignment_info", namespace = Namespaces.af)
	@XmlElement(name = "serviceForm", namespace = Namespaces.af)
	private List<ServiceForm> serviceForms;

//	ISO 8601
	@XmlElement(name = "lastChanging", namespace = Namespaces.pac)
	private String lastChanging;


	@XmlTransient
	private LocalMSZ localMSZ;

	public Fact(String ID, String OSZCode, String LMSZID, String categoryID, String decision_date, String dateStart, String dateFinish, String lastChanging) {
		this.ID = ID;
		this.OSZCode = OSZCode;
		this.LMSZID = LMSZID;
		this.categoryID = categoryID;
		this.decision_date = decision_date;
		this.dateStart = dateStart;
		this.dateFinish = dateFinish;
		this.lastChanging = lastChanging;
	}
}
