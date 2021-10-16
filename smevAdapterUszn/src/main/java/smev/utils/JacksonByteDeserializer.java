package smev.utils;


import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import java.io.IOException;


public class JacksonByteDeserializer
        extends StdDeserializer<byte[]> {
    private static final long serialVersionUID = 1514703510863497028L;

    protected JacksonByteDeserializer() {
        super(byte[].class);
    }


    public byte[] deserialize(JsonParser parser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        JsonNode node = (JsonNode) parser.getCodec().readTree(parser);
        String base64 = node.asText();

        return EDUtil.decodeBase64(base64);
    }
}

