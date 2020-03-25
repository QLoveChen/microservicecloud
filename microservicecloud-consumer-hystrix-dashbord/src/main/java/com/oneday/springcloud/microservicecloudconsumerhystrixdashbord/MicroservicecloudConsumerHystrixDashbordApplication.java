package com.oneday.springcloud.microservicecloudconsumerhystrixdashbord;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class MicroservicecloudConsumerHystrixDashbordApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroservicecloudConsumerHystrixDashbordApplication.class, args);
    }

}
