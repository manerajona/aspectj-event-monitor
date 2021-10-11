package com.manerajona.domain;

//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.extern.slf4j.Slf4j;

import com.manerajona.annotation.JsonToString;
import com.manerajona.annotation.Monitor;

//@Slf4j
//@Getter
//@AllArgsConstructor
@JsonToString
public class MyEntity {

    private final String name;

    public MyEntity(String name) {
        this.name = name;
    }

    @Monitor
    public void sayHello() {
        //log.info("Hello {}", this.name);
        System.out.println("Hello " + this.name);
    }

    public String getName() {
        return name;
    }

}
