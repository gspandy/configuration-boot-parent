package com.janita.autoconfig.one.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 测试自定义配置类读取属性值得位置
 */
@ConfigurationProperties(prefix="iam")
public class CustomConfigBean {

	private String username;
	private int age;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
		System.out.println("*******启动项目时初始化username的值："+username);
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
		System.out.println("*******启动项目时初始化age的值："+age);
	}
	
	
}
