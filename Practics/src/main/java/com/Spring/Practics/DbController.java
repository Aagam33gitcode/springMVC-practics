package com.Spring.Practics;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/")
public class DbController {

    @GetMapping
    public String Hello(){
        System.out.println("hello");
        //to seen in Screen add dependency tomcat jasper
        return "hello";
    }
    @GetMapping("m")
    public String add(){
        return "bye bye";
    }

    @GetMapping("{rollNo}")
    public DBdto getdetails(@PathVariable(name = "rollNo") int rollno){
        return new DBdto(rollno,"Hello",23213432);

    }

    @PutMapping("/add")
    public List<DBdto> addData(){
        return new ArrayList<>();
    }

    @PostMapping
    public DBdto addData(@RequestBody DBdto dBdto){
        dBdto.setRollNO(1);
        return dBdto;
    }



}
