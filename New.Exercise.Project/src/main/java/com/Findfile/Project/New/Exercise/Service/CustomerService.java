package com.Findfile.Project.New.Exercise.Service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Findfile.Project.New.Exercise.Project.Entity.CustomerEntity;
import com.Findfile.Project.New.Exercise.Project.repository.CustomerDTO;
@Service
public class CustomerService 
{
	@Autowired
	private CustomerDTO DTO;
	String line="";
   public void saveCustomerData() throws NumberFormatException, IOException {
	  
	   try {
		BufferedReader  buffer=new BufferedReader(new FileReader("C:\\Users\\Astegic\\Desktop\\data.csv"));
	while((line=buffer.readLine())!=null) {
		String [] datafile=line.split(",");
		CustomerEntity record=new CustomerEntity();
		record.setId(Integer.parseInt(datafile[0]));
		record.setName(datafile[1]);
		record.setGender(datafile[2]);
		record.setAge(Integer.parseInt(datafile[3]));
		if(record.getAge()>25) {
			if(record.getGender().equalsIgnoreCase("M")) {
				record.setGender("Male");
			}else {
				record.setGender("Female");
			}
			DTO.save(record);
		}
		
	}
	   
	   } catch (FileNotFoundException e) {
		
		e.printStackTrace();
	}
   }
}
