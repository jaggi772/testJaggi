package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PojoService {

	@Autowired
	Pojo pojo;
	
	public void test() {
		System.out.println("service"+pojo.toString());
	}
	
}
