package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.module.Employee;
import com.example.demo.service.StudentService;

@RestController
public class ApiController {

	@Autowired
	StudentService sser;
	@PostMapping("addstudent")
	public Employee add(@RequestBody Employee ss)
	{
		return sser.saveinfo(ss);
	}
	@GetMapping("showdetails")
	public List<Employee> show()
	{
		return sser.showinfo();
	}
	
}
