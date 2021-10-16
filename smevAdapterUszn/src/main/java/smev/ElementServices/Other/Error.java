 package smev.ElementServices.Other;



import javax.xml.bind.annotation.*;


 @XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "", propOrder = {"code", "description", "details"})
 @XmlRootElement(name = "Error")
 public class Error
 {
   @XmlElement(name = "Code")
   private int code;
   @XmlElement(name = "Description", required = true)
   private String description;
   @XmlElement(name = "Details")
   private String details;

   public int getCode() {
/* 28 */     return this.code;
   }

   public void setCode(int code) {
/* 32 */     this.code = code;
   }

   public String getDescription() {
/* 36 */     return this.description;
   }

   public void setDescription(String description) {
/* 40 */     this.description = description;
   }

   public String getDetails() {
/* 44 */     return this.details;
   }

   public void setDetails(String details) {
/* 48 */     this.details = details;
   }
 }

