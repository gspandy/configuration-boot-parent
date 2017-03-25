package com.janita.random;

import com.janita.random.bean.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Janita on 2017-03-25 15:02
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class RandomApplicationTests {

    @Autowired
    private User user;

    @Test
    public void testUser(){
        System.out.println("*******"+user);
    }

}
