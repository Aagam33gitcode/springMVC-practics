package com.Spring.Practics;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class ProdDb  implements DB{
    String prodDb(){
        return "this is prodDb class Method";
    }

    @Override

    public String getData() {
        return "this is prodDb class Method";
    }
    @PostConstruct
    void CallPost(){
        System.out.println( "this is post constuct");
    }
    @PreDestroy
    void  preDistroy(){
        System.out.println( "PreDistroy Methods");
    }


}
