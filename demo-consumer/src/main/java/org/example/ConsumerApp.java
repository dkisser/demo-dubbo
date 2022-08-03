package org.example;

import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.apache.dubbo.sample.tri.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @Author Paul
 * @Date 2022/8/3 19:55
 */
@EnableDubbo
@SpringBootApplication
public class ConsumerApp {

    @DubboReference
    private Greeter greeter;

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(ConsumerApp.class, args);
        Greeter bean = context.getBean(Greeter.class);
        GreeterRequest request = GreeterRequest.newBuilder().setName("test123123").build();
        GreeterReply reply = bean.greet(request);
        System.out.println(reply.getMessage());
    }
}
