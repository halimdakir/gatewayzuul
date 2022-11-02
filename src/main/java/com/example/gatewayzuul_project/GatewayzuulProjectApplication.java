package com.example.gatewayzuul_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;


@EnableZuulProxy
@SpringBootApplication
public class GatewayzuulProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayzuulProjectApplication.class, args);
    }

}
