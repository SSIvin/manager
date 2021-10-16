//package smev.FRI.Strategy;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import smev.FRI.Service.BroadcastStrategy;
//
//import java.util.List;
//import java.util.Map;
//import java.util.function.Function;
//import java.util.stream.Collectors;
//
//@Configuration
//public class Config {
//
//    @Bean
//    public Map<String, BroadcastStrategy> map2(List<BroadcastStrategy> strategies) {
//        return strategies.stream().collect(Collectors.toMap(o -> o.getIdInquery(), Function.identity()));
//    }
//
//}
