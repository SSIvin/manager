 package smev.ElementServices.Other;

 import smev.ElementServices.fault.Fault;

 import javax.xml.bind.annotation.XmlAccessType;
 import javax.xml.bind.annotation.XmlAccessorType;
 import javax.xml.bind.annotation.XmlElement;
 import javax.xml.bind.annotation.XmlType;


 @XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "ErrorMessage", propOrder = {"type", "fault"})
 public class ErrorMessage
   extends StatusMessage
 {
   @XmlElement(required = true)
   protected ErrorType type;
   @XmlElement(required = true)
   protected Fault fault;

   public ErrorType getType() {
/* 54 */     return this.type;
   }









   public void setType(ErrorType value) {
/* 66 */     this.type = value;
   }









   public Fault getFault() {
/* 78 */     return this.fault;
   }









   public void setFault(Fault value) {
/* 90 */     this.fault = value;
   }
 }


/* Location:              F:\Java_project\01_work\01 temp\smev-adapter\BOOT-INF\lib\3.1.7\schema-3.1.7.jar!\ru\voskhod\smev\adapter\autogenerated\types\ErrorMessage.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
