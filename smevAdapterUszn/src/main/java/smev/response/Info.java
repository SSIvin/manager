 package smev.response;

 public class Info {
/*  4 */   State state = State.SUCCESS;


   String description;


   public State getState() {
/* 11 */     return this.state;
   }

   public void setState(State state) {
/* 15 */     this.state = state;
   }

   public String getDescription() {
/* 19 */     return this.description;
   }

   public void setDescription(String description) {
/* 23 */     this.description = description;
   }
 }


/* Location:              F:\Java_project\01_work\01 temp\smev-adapter\BOOT-INF\lib\3.1.7\back-3.1.7.jar!\ru\rtlabs\smev3\adapte\\ui\back\response\Info.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
