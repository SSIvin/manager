 package smev.ElementServices.Other;



import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

 @XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "", propOrder = {"key", "value"})
 public class Parameter
 {
   @XmlElement(name = "Key", required = true)
   private String key;
   @XmlElement(name = "Value", required = true)
   private String value;

   public String getKey() {
/* 22 */     return this.key;
   }

   public void setKey(String key) {
/* 26 */     this.key = key;
   }

   public String getValue() {
/* 30 */     return this.value;
   }

   public void setValue(String value) {
/* 34 */     this.value = value;
   }
 }


/* Location:              F:\Java_project\01_work\01 temp\smev-adapter\BOOT-INF\lib\3.1.7\model-3.1.7.jar!\ru\rtlabs\smev3\adapter\common\model\entities\core\transport\status\Parameter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
