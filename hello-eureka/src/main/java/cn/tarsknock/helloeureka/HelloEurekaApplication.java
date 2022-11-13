package cn.tarsknock.helloeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication
public class HelloEurekaApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(
				HelloEurekaApplication.class)
				.web(true).run(args);
	}

}
