package com.oneday.springcloud.microservicecloudconsumerdept80.controller;

import com.oneday.springcloud.micriservicecloudapi.entities.DeptEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author GongXings
 * @createTime 30 15:48
 * @description
 */
@RestController
public class DeptConsumerController {

//    private static final String REST_URL_PREFIX="http://localhost:8001";
    /**
     * 注册再EurekaServer中的微服务名称
     */
    private static final String REST_URL_PREFIX="http://MICROSERVICECLOUD-DEPT";
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/consumer/dept/add")
    public boolean add( DeptEntity deptEntity){
        //三个参数：url,requestMap ResponseBean.class
        return  restTemplate.postForObject(
                REST_URL_PREFIX+"/dept/add",
                deptEntity,
                Boolean.class);
    }

    @RequestMapping("/consumer/dept/findById/{deptNo}")
    public DeptEntity findById(Long deptNo){
        //三个参数：url,requestMap ResponseBean.class
        return  restTemplate.getForObject(
                REST_URL_PREFIX+"/dept/findById/"+deptNo,
                DeptEntity.class);
    }

    @RequestMapping("/consumer/dept/findAll")
    public List findAll(){
        //三个参数：url,requestMap ResponseBean.class
        return  restTemplate.getForObject(
                REST_URL_PREFIX+"/dept/findAll",
                List.class);
    }

    @RequestMapping(value = "/consumer/dept/discovery")
    public Object discovery(){
        return  restTemplate.getForObject(
                REST_URL_PREFIX+"/dept/discovery",
                Object.class);
    }
}