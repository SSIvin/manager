 package smev.ElementServices.Other;



import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

 @XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "", propOrder = {"code", "description"})
 public class RejectItem
 {
   @XmlElement(name = "Code", required = true)
   private String code;
   @XmlElement(name = "Description", required = true)
   private String description;

     public RejectItem() {
     }

     public RejectItem(String code, String description) {
         this.code = code;
         this.description = description;
     }

     public String getCode() {
/* 23 */     return this.code;
   }

   public void setCode(String code) {
/* 27 */     this.code = code;
   }

   public String getDescription() {
/* 31 */     return this.description;
   }

   public void setDescription(String description) {
/* 35 */     this.description = description;
   }
 }

