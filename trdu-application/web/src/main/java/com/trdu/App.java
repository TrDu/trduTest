package com.trdu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

/**
 * @Author: tanyong
 * @Description:
 * @Date: 2019/6/28 16:38
 * @Modified By:
 */
@SpringBootApplication
@ComponentScan("com.trdu")
@PropertySource("classpath:application-web.properties")
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
