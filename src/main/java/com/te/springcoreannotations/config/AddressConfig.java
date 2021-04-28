package com.te.springcoreannotations.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.te.springcoreannotations.bean.Address;

@Configuration
public class AddressConfig {

	@Bean("kar")
	public Address getAdd() {
		Address address=new Address();
		address.setPincode(591107);
		address.setState("Karnataka");
		return address;
	}
}
