package cn.tarsknock.eurekaconsumer.controller;

import cn.tarsknock.eurekaconsumer.feign.DcClient;
import cn.tarsknock.eurekaconsumer.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class DcController {

    @Autowired
    private ConsumerService consumerService;

    @GetMapping("/consumer")
    public String dc(){
        return consumerService.dc();
    }

}
