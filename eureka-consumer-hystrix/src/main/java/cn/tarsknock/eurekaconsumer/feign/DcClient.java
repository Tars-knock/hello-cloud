package cn.tarsknock.eurekaconsumer.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("eureka-consumer-feign")
public interface DcClient {

    @GetMapping("/consumer")
    String consumer();
}
