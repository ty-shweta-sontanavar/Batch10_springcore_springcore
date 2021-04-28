package com.te.springcoreannotations.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import({StudentConfig.class,AddressConfig.class})
@Configuration
public class AllConfig {

}
