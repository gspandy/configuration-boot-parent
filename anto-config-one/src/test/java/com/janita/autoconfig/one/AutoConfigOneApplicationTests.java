package com.janita.autoconfig.one;

import com.janita.autoconfig.one.configuration.DruidDataSourceConfiguration;
import com.janita.autoconfig.one.configuration.RedisConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Janita on 2017-03-25 13:27
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class AutoConfigOneApplicationTests {

    @Autowired
    private RedisConfig redisConfig;

    @Autowired
    private DruidDataSourceConfiguration druidDataSourceConfiguration;

    @Test
    public void redisPrint(){
        System.out.println("*******"+redisConfig);
    }

    @Test
    public void druidPrint(){
        System.out.println("*******"+druidDataSourceConfiguration);
    }
}
