package com.testdemo.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class DemoApplicationTests {

	Calculator testClass = new Calculator();

	@Test
	void contextLoads() {

	}

	@Test
	void testAdd(){
		assertThat(new Calculator().add(2,5)).isEqualTo(6);
	}

	class Calculator{
		int add(int a, int b){
			return a + b;
		}
	}
}
