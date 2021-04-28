package com.te.springcoreannotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.te.springcoreannotations.bean.Student;
import com.te.springcoreannotations.config.AllConfig;
import com.te.springcoreannotations.config.StudentConfig;

public class StudentTest {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(AllConfig.class);
		 Student student =context.getBean(Student.class);
		 System.out.println(student.getId());
		 System.out.println(student.getName());
		System.out.println(student.getAdd().getPincode());
		System.out.println(student.getAdd().getState());
	}

}
