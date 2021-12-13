package com.xiaomi.hello;

import com.xiaomi.hello.pojo.Dog;
import com.xiaomi.hello.pojo.Person;
import com.xiaomi.hello.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HelloApplicationTests {

	@Autowired
	User user;
	@Autowired
	Dog dog;
	@Autowired
	Person person;

	@Test
	void contextLoads() {
		System.out.println(person);

	}

	@Test
	void test1(){
		System.out.println(user);
	}

}
