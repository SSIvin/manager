 package smev.response;



import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


 public class ResponseBuilder
 {
  Response response = new Response();




   public ResponseBuilder content(Object content) {
     this.response.content = content;
    return this;
   }



   public ResponseBuilder success() {
/* 19 */     this.response.info.state = State.SUCCESS;
/* 20 */     this.response.info.description = "";
/* 21 */     return this;
   }

   public ResponseBuilder failure(String description) {
/* 25 */     this.response.info.state = State.FAILURE;
/* 26 */     this.response.info.description = description;
/* 27 */     return this;
   }

   public ResponseBuilder exception(Exception ex) {
/* 31 */     ByteArrayOutputStream bytes = new ByteArrayOutputStream();
/* 32 */     ex.printStackTrace(new PrintStream(bytes));
/* 33 */     this.response.content = bytes.toString();
/* 34 */     return this;
   }

   public Response build() {
/* 38 */     return this.response;
   }
 }

