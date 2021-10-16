package smev.utils;


import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;


public class JacksonByteSerializer
        extends StdSerializer<byte[]> {
    private static final long serialVersionUID = -5510353102817291511L;

    public JacksonByteSerializer() {
        /* 14 */
        super(byte[].class);
    }


    public void serialize(byte[] value, JsonGenerator generator, SerializerProvider provider) throws IOException {
           generator.writeString(EDUtil.encodeBase64(value));
    }
}


