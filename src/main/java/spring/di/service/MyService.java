package spring.di.service;

import org.springframework.stereotype.Service;

import java.util.Date;

public class MyService {
    public void log(String msg){
        System.out.println(new Date()+"::"+msg);
    }

}
