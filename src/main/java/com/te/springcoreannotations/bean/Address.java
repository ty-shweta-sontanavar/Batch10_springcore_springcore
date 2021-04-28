package com.te.springcoreannotations.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Address {

	public Address() {
		
	}
	private long pincode;
	
	private String state;
	
}
