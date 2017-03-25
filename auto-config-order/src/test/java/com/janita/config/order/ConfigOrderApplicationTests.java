package com.janita.config.order;

import com.janita.config.order.bean.ClassRoom;
import com.janita.config.order.bean.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Janita on 2017-03-25 14:41
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class ConfigOrderApplicationTests {

    @Autowired
    private User user;

    @Autowired
    private ClassRoom classRoom;

    @Test
    public void testUser(){
        System.out.println("*******"+user);
    }

    @Test
    public void testRoom(){
        System.out.println("*******"+classRoom);
    }
}
