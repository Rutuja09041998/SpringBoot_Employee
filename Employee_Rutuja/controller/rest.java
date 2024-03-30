package com.tutofox.Employee_Rutuja.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tutofox.Employee_Rutuja.entity.Employee;
import com.tutofox.Employee_Rutuja.service.Employee_service;

@RestController
@RequestMapping("Employee")
public class rest {
	
	@Autowired
	private Employee_service employee_service;
	
	@PostMapping("save")
	public Employee saveName(@RequestBody Employee employee)
	{
		return employee_service.save(employee);
	}
	
	@GetMapping("All")
	public List<Employee> getEmployee()
	{
		return employee_service.get();
	}
	
	@GetMapping("get/{id}")
	public Employee getEmpId(@PathVariable int id)
	{
		return employee_service.getId(id);
	}
	
	@DeleteMapping("delete/{id}")
	public Employee deleteEmployee(@PathVariable int id)
	{
		return employee_service.delete(id);
	}
	
	@PutMapping("update/{id}")
	public Employee updateEmployee(@RequestBody Employee employee,@PathVariable int id)
	{
		return employee_service.update(employee, id);
	}
	
}
