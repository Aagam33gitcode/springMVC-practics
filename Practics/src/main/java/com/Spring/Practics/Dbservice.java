package com.Spring.Practics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Dbservice {
//    @Autowired
//  private  DevDb db;
    private DB db;
    Dbservice(DB db){
        this.db=db;
    }
    public String getData() {
        return db.getData();
    }
}
