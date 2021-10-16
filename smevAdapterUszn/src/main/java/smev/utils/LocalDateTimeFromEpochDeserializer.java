 package smev.utils;



import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import java.io.IOException;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

 public class LocalDateTimeFromEpochDeserializer
   extends StdDeserializer<LocalDateTime> {
   private static final long serialVersionUID = 1L;

   protected LocalDateTimeFromEpochDeserializer() {
/* 18 */     super(LocalDate.class);
   }


   public LocalDateTime deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
/* 23 */     return Instant.ofEpochMilli(((Long)jsonParser.readValueAs(Long.class)).longValue()).atZone(ZoneId.systemDefault()).toLocalDateTime();
   }
 }


/* Location:              F:\Java_project\01_work\01 temp\smev-adapter\BOOT-INF\lib\3.1.7\model-3.1.7.jar!\ru\rtlabs\smev3\adapter\common\model\helpers\LocalDateTimeFromEpochDeserializer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
