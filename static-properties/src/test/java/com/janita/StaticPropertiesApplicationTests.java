package com.janita;

import com.janita.config.PropertiesConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StaticPropertiesApplicationTests {

	@Test
	public void contextLoads() {
	}


	@Test
	public void test() {
		System.out.println("\n***** : " + PropertiesConfig.PRO_ONE);
	}

}
