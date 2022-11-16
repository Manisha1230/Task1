package com.Findfile.Project.New.Exercise.Controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Findfile.Project.New.Exercise.Service.CustomerService;

@RestController
public class ControllerClass {
	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/cus")
	public void setDataInDB() throws Exception {
		customerService.saveCustomerData();
		
	}
	

}
