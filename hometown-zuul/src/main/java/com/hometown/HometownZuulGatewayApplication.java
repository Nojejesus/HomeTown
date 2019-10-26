package com.hometown;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * 注解 @EnableZuulProxy 标识当前应用为网关服务器
 * 注解 @SpringCloudApplication 为简化配置的组合注解
 * Create by JJ on 2019/10/26.
 */
@EnableZuulProxy
@SpringCloudApplication
public class HometownZuulGatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(HometownZuulGatewayApplication.class, args);
    }
}
