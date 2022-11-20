package cn.tarsknock.eurekaconsumer.service;

import cn.tarsknock.eurekaconsumer.feign.DcClient;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

    @Autowired
    private DcClient dcClient;

    @HystrixCommand(fallbackMethod = "fallback")
    public String dc(){
        return dcClient.consumer() + " --> hystrix consumer (not fuse)";
    }

    public String fallback(){
        return "XXX --> hystrix consumer (fused)";
    }

}
