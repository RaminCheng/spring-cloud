package com.cramin.springcloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author ChengRuimin
 * @date: 2019/10/28 11:30
 * @description:
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaCpsApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaCpsApplication.class, args);
    }
}
