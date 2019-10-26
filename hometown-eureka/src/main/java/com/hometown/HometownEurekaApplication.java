package com.hometown;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 注解 @EnableEurekaServer 让当前应用成为 Eureka Server
 * Create by JJ on 2019/10/26.
 */
@EnableEurekaServer
@SpringBootApplication
public class HometownEurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(HometownEurekaApplication.class, args);
    }
}
