package smev.ElementServices.fault;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Fault", propOrder = {"code", "description"})
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Fault
{
  @XmlElement
  private String code;
  @XmlElement
  private String description;

}

