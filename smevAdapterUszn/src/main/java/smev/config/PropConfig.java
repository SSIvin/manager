package smev.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.Environment;
import org.springframework.core.env.PropertySource;
import org.springframework.core.io.support.ResourcePropertySource;

import java.util.Map;

@Configuration
@org.springframework.context.annotation.PropertySource(value = "classpath:KSZN.properties", encoding="UTF-8")
public class PropConfig {

    @Autowired
    Environment env;

    @Bean
    public Map<String, Object> Prop() {

//        Map<String, String> myMap= new HashMap<String, String>();
        for (PropertySource<?> propertySource : ((ConfigurableEnvironment) env).getPropertySources()) {
            if (propertySource instanceof ResourcePropertySource ) {
                if (((ResourcePropertySource) propertySource).getName().contains("KSZN.properties")) {
                    return ((ResourcePropertySource) propertySource).getSource();
                }

            }


//            if (propertySource instanceof ResourcePropertySource & ) {
//                for (String key : ((EnumerablePropertySource) propertySource).getPropertyNames()) {
//                    if (key.startsWith("search")) {
//                        myMap.put(key.replace("search.myprop.", ""), propertySource.getProperty(key).toString());
//                    }
//                }
//            }
        }



        //Map<String, Object> map = new HashMap();
//        for (Iterator it = ((AbstractEnvironment) env).getPropertySources().iterator();
//             it.hasNext();
//        ) {
//            PropertySource propertySource = (PropertySource) it.next();
//            if (propertySource instanceof MapPropertySource) {
//                map.putAll(((MapPropertySource) propertySource).getSource());
//            }
//            return propertySource;
//        }
        return null;
    }

}
