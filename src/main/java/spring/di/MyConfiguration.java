package spring.di;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import spring.di.service.MyService;

@Configuration
@ComponentScan(value = "spring.di")
public class MyConfiguration {

    @Bean
    public MyService getService(){
        return new MyService();
    }
}
