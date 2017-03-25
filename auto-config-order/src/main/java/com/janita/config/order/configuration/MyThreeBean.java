package com.janita.config.order.configuration;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

/**
 * Created by Janita on 2017-03-25 14:54
 */
@Configuration
@Order(3)
public class MyThreeBean implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("*******执行了MyThreeBean");
    }
}
