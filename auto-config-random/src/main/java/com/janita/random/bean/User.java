package com.janita.random.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import java.io.Serializable;

/**
 * Created by Janita on 2017-03-25 15:03
 */
@Configuration
public class User implements Serializable {

    @Value("${user.id}")
    private String userId;

    @Value("${user.age}")
    private Integer age;

    @Value("${user.money}")
    private Long money;

    @Value("${user.name}")
    private String name;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Long getMoney() {
        return money;
    }

    public void setMoney(Long money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", age=" + age +
                ", money=" + money +
                ", name='" + name + '\'' +
                '}';
    }
}
