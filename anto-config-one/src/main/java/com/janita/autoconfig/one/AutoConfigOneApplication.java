package com.janita.autoconfig.one;

import com.janita.autoconfig.one.configuration.CustomConfigBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * Created by Janita on 2017-03-25 11:07
 */
@SpringBootApplication
@EnableConfigurationProperties({CustomConfigBean.class})
public class AutoConfigOneApplication {

    public static void main(String[] args) {
        SpringApplication.run(AutoConfigOneApplication.class, args);
    }

}
