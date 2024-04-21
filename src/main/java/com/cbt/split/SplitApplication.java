package com.cbt.split;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan( basePackages = {"com.cbt.split"})
public class SplitApplication {

    public static void main(String[] args) {
        SpringApplication.run(SplitApplication.class, args);
        System.out.println("This Application Is Developed By Neeraj Kumar.");
    }

}
