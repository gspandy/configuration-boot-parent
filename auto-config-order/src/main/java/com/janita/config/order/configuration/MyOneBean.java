package com.janita.config.order.configuration;

import com.janita.config.order.bean.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

/**
 * Created by Janita on 2017-03-25 14:42
 */
@Configuration
@Order(1)
public class MyOneBean implements CommandLineRunner{

    @Override
    public void run(String... args) throws Exception {
        System.out.println("*******执行了MyOneBean");
        injectUser();
    }

    @Bean
    public User injectUser(){
        User user = new User();
        user.setName("Janita");
        user.setAge(18);
        return user;
    }
}
