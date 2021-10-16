 package smev.ElementServices.Other;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

 @XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "Reject", propOrder = {"code", "description"})
 @AllArgsConstructor
 @NoArgsConstructor
 @Data
 public class Reject
 {
   @XmlElement(required = true)
   private RejectCode code;
   @XmlElement(required = true)
   private String description;
 }
