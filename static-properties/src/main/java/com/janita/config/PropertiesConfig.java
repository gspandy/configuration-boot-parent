package com.janita.config;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by Janita on 2017/6/23 0023-上午 10:01
 * 该类是：
 */
@ConfigurationProperties
public class PropertiesConfig implements InitializingBean{

   public static String PRO_ONE;

   @Value("${strong.url.strongTest}")
   private String proOne;

    @Override
    public void afterPropertiesSet() throws Exception {
        PRO_ONE = proOne;
    }
}
