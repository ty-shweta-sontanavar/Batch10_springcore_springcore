package com.te.springcoreannotations.bean;



import org.springframework.beans.factory.annotation.Autowired;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student {

	public Student() {
		
	}
	private int id;
	
	private String name;
	
	@Autowired(required = false)
	private Address add;

	
}
