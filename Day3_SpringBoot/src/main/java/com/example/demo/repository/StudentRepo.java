package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.module.Employee;

public interface StudentRepo extends JpaRepository<Employee, Integer>{

}
