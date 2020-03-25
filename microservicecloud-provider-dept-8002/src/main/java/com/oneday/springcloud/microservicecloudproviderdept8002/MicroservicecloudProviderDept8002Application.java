package com.oneday.springcloud.microservicecloudproviderdept8002;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
//本服务启动后会自动注册进eureka服务
@EnableEurekaClient
@EnableDiscoveryClient
public class MicroservicecloudProviderDept8002Application {

    public static void main(String[] args) {
        SpringApplication.run(MicroservicecloudProviderDept8002Application.class, args);
    }

}
