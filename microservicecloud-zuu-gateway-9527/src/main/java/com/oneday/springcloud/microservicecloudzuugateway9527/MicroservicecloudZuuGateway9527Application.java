package com.oneday.springcloud.microservicecloudzuugateway9527;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class MicroservicecloudZuuGateway9527Application {

    public static void main(String[] args) {
        SpringApplication.run(MicroservicecloudZuuGateway9527Application.class, args);
    }

}
