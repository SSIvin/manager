package smev.Egisso.Elements.ElementsNazn;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "termination")
@XmlAccessorType (XmlAccessType.FIELD)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Termination
{

	@XmlElement(name = "ID", namespace = Namespaces.pac)
	private String ID;

	@XmlElement(name = "assignmentFactID", namespace = Namespaces.pac)
	private String assignmentFactID;

	@XmlElement(name = "dateFinish", namespace = Namespaces.pac)
	private String dateFinish;

//	ISO 8601
	@XmlElement(name = "lastChanging", namespace = Namespaces.pac)
	private String lastChanging;
}
