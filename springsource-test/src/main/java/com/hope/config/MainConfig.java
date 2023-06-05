package com.hope.config;

import com.hope.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({Person.class})
public class MainConfig {

	/*@Bean
	public Person person() {
		Person person = new Person();
		person.setName("李四");
		return person;
	}*/
}
