package com.zsinda.fdp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class FdpGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(FdpGatewayApplication.class,args);
    }

}
