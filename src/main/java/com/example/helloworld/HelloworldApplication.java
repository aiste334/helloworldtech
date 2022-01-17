package com.example.helloworld;

import ch.qos.logback.classic.gaffer.GafferConfigurator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class HelloworldApplication {



    public static void main(String[] args) {
        System.out.println(System.getProperty("java.version"));
        SpringApplication.run(HelloworldApplication.class, args);
    }

}
