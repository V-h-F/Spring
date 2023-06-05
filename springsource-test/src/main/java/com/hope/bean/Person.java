package com.hope.bean;

import lombok.Data;
import lombok.ToString;

import java.util.StringJoiner;

@Data
@ToString
public class Person  {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return new StringJoiner(", ", Person.class.getSimpleName() + "[", "]")
				.add("name='" + name + "'")
				.toString();
	}
}
