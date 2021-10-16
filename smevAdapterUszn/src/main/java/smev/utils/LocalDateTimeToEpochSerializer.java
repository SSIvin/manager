 package smev.utils;


 import com.fasterxml.jackson.core.JsonGenerator;
 import com.fasterxml.jackson.databind.SerializerProvider;
 import com.fasterxml.jackson.databind.ser.std.StdSerializer;

 import java.io.IOException;
 import java.time.Instant;
 import java.time.LocalDateTime;
 import java.time.ZoneId;


 public class LocalDateTimeToEpochSerializer
   extends StdSerializer<LocalDateTime> {
   private static final long serialVersionUID = 1L;

   protected LocalDateTimeToEpochSerializer() {
/* 15 */     super(LocalDateTime.class);
   }


   public void serialize(LocalDateTime dateTime, JsonGenerator generator, SerializerProvider serializerProvider) throws IOException {
       Instant instant = dateTime.atZone(ZoneId.systemDefault()).toInstant();
       Long timeInMillis = instant.toEpochMilli();
       //Long epochSec = Long.valueOf(dateTime.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli());
    generator.writeString(timeInMillis.toString());
   }
 }


/* Location:              F:\Java_project\01_work\01 temp\smev-adapter\BOOT-INF\lib\3.1.7\model-3.1.7.jar!\ru\rtlabs\smev3\adapter\common\model\helpers\LocalDateTimeToEpochSerializer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
