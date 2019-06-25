package com.imooc.ad;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author zms
 * @data 2019/6/25
 */
@EnableZuulProxy
@SpringCloudApplication
public class ZuulGatewayApplication {
    public static void main(String[] arg){
        SpringApplication.run(ZuulGatewayApplication.class, arg);
    }
}
