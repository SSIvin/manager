package smev.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

import javax.xml.bind.Marshaller;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class JaxB2MarshallerConfig {

//    @Bean
    public Jaxb2Marshaller jaxb2Marshaller()
    {
        try
        {
            // Create the marshaller that is aware of our Java XSD and it's auto-generated classes.
            Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
            marshaller.setPackagesToScan(new String[]{"smev.ElementServices.Egisso.ElementsKmsz","smev.ElementServices.Fri"});

            // Get the JAXB XML headers from the environment.

            // We need to set marshaller properties to reconfigure the XML header.
//            Map<String, Object> marshallerProperties = new HashMap<>();
//            marshaller.setMarshallerProperties(marshallerProperties);

            // Remove the header that JAXB will generate.
//            marshallerProperties.put(Marshaller.JAXB_FRAGMENT, Boolean.TRUE);
            return marshaller;
        }
        catch (Exception ex)
        {
            // Throw a runtime exception instead of a checked IOException since the XSD file should be contained within our application.
            throw new IllegalArgumentException("Unable to create marshaller.", ex);
        }
    }


}
