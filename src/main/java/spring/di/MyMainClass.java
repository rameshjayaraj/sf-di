package spring.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.di.service.MyService;

public class MyMainClass {
    public static void main(String args[]){

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(
                MyConfiguration.class);

        MyService service = (MyService) ctx.getBean(MyService.class);

        service.log("Hi");
    }
}
