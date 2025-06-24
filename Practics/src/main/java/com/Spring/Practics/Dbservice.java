package com.Spring.Practics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Dbservice {
private final ProdDb prodDb;
Dbservice(ProdDb prodDb){
this.prodDb=prodDb;}


    public boolean getData() {
    return false;
    }
}
