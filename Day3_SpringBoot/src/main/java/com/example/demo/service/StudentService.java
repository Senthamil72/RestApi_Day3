package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.module.Employee;
import com.example.demo.repository.StudentRepo;

@Service
public class StudentService {
	@Autowired
	StudentRepo sr;
	public Employee saveinfo(Employee ss)
	{
		return sr.save(ss);
		
	}
	public List<Employee> showinfo()
	{
		return sr.findAll();
	}

}
