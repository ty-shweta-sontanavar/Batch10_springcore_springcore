
package com.te.springcoreannotations.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.te.springcoreannotations.bean.Student;

@Configuration
public class StudentConfig {
  
	@Bean
	public Student getStudent() {
		Student student=new Student();
		student.setId(1);
		student.setName("shweta");
		return student;
	}
}
