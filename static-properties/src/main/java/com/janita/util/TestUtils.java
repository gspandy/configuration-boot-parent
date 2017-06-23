package com.janita.util;


import com.janita.config.PropertiesConfig;

/**
 * Created by Janita on 2017/6/23 0023-上午 10:06
 * 该类是：
 */
public class TestUtils {

    /**
     * TODO
     * 在这里测试肯定是么有值的
     * 需要在 test里面测试
     * 因为只有项目启动之后才能注入值
     * 在这是没有注入的
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("\n***** : " + PropertiesConfig.PRO_ONE);
    }

}
