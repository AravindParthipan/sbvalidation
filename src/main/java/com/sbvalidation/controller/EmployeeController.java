package com.sbvalidation.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sbvalidation.beans.Employee;

@RestController
public class EmployeeController {

	@Autowired
	private Employee employee;
	
	@PostMapping(value = "create")
	public Employee createEmployee(@Valid @RequestBody Employee employee) {
		return employee;
	}
	
}
