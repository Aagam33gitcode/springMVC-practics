package com.Spring.Practics;

import lombok.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class DBdto {



    private int rollNO;
    private String dbName;
    private Long phoneNo;

    public int getRollNO() {
        return rollNO;
    }

    public void setRollNO(int rollNO) {
        this.rollNO = rollNO;
    }

    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public Long getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(Long phoneNo) {
        this.phoneNo = phoneNo;
    }

    public DBdto(int rollNO, String dbName, long phoneNo) {
        this.dbName=dbName;
        this.phoneNo=phoneNo;
        this.rollNO=rollNO;
    }




}
