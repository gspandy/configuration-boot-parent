package com.janita.config.order.configuration;

import com.janita.config.order.bean.ClassRoom;
import com.janita.config.order.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

/**
 * Created by Janita on 2017-03-25 14:43
 */
@Configuration
@Order(2)
public class MyTwoBean implements CommandLineRunner {

    @Autowired(required = false)
    private User user;

    /**
     * 实现了此接口的类，启动的时候会执行此run()方法
     * @param args
     * @throws Exception
     */
    @Override
    public void run(String... args) throws Exception {
        System.out.println("*******执行了MyTwoBean");
        injectRoom();
    }

    @Bean
    public ClassRoom injectRoom(){
        ClassRoom room = new ClassRoom();
        room.setClassroomId(238);
        room.setUser(user);
        return room;
    }
}
