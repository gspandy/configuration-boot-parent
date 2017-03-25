package com.janita.autoconfig.yaml;

import com.janita.autoconfig.yaml.configuration.RedisYmalConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Janita on 2017-03-25 13:51
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class AutoConfigYamlApplicationTests {

    @Autowired
    private RedisYmalConfig redisYmalConfig;

    @Test
    public void test(){
        System.out.println("*******");
    }

    @Test
    public void testRedisPrint(){
        System.out.println("*******"+redisYmalConfig);
    }
}
