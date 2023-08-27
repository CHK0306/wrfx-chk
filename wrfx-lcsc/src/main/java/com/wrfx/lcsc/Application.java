package com.wrfx.lcsc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.wrfx.lcsc")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
