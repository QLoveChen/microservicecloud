package com.oneday.springcloud.microservicecloudconsumerdept80;

//import com.oneday.springcloud.rule.MyRandomRule;
import com.oneday.springcloud.microservicecloudconsumerdept80.rule.MyRandomRule;
import com.oneday.springcloud.microservicecloudconsumerdept80.rule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableEurekaClient
/**
 * 在启动该微服务式是能去加载我们定义的Ribbon配置类
 */
@RibbonClient(name="MICROSERVICECLOUD-DEPT",configuration = MySelfRule.class)
public class MicroservicecloudConsumerDept80Application {

    public static void main(String[] args) {
        SpringApplication.run(MicroservicecloudConsumerDept80Application.class, args);
    }

}
