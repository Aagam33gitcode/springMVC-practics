package com.Spring.Practics;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class DevDb implements DB {
//    public String gerData() {
//        return "this is DevDb class methods";
//
//    }

    @Override
    public String getData() {
        return "this is DevDb class methods";
    }
}

