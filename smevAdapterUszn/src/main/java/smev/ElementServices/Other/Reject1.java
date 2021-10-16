 package smev.ElementServices.Other;



import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

 @XmlAccessorType(XmlAccessType.FIELD)
 @XmlType(name = "rejects", propOrder = {"items"})
 @XmlRootElement(name = "Reject")
 public class Reject1
 {
   @XmlElement(name = "Item")
   private List<RejectItem> items;

   public List<RejectItem> getItems() {
/* 23 */     if (this.items == null) {
/* 24 */       this.items = new ArrayList<>();
     }
/* 26 */     return this.items;
   }

   public void setItems(List<RejectItem> items) {
/* 30 */     this.items = items;
   }
 }

