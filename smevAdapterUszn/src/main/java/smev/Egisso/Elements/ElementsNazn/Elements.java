package smev.Egisso.Elements.ElementsNazn;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "elements")
@XmlAccessorType (XmlAccessType.FIELD)
@Data
public class Elements
{
	@XmlElement(name = "fact")
	private List<Fact> fact = null;
}
