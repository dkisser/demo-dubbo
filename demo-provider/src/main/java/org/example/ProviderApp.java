package org.example;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @Author Paul
 * @Date 2022/8/3 20:14
 */
@EnableDubbo
@SpringBootApplication
public class ProviderApp {
    public static void main(String[] args) {
        SpringApplication.run(ProviderApp.class, args);
    }
}
