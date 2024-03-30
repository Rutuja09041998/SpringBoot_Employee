package com.tutofox.Employee_Rutuja.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.tutofox.Employee_Rutuja.entity.Employee;
import com.tutofox.Employee_Rutuja.repository.Repo;


@Service
public class Employee_service {
	
	@Autowired
	private Repo repo;
	
	public Employee save(Employee employee)
	{
		return repo.save(employee);
	}
	
	public List<Employee> get()
	{
		return repo.findAll();
	}
	
	public Employee getId(int id)
	{
		Optional<Employee> optional= repo.findById(id);
		if(optional.isPresent())
		{
			return optional.get();
		}
		return null;
	}
	
	public Employee delete(int id)
	{
		Optional<Employee> optional= repo.findById(id);
		if(optional.isPresent())
		{
			repo.deleteById(id);
			return optional.get();
		}
		return null;
	}
	
	public Employee update(Employee employee,int id)
	{
		Optional<Employee> optional=repo.findById(id);
		Employee dbEmployee= new Employee();
		if(optional.isPresent())
		{
			dbEmployee=optional.get();
			employee.setId(dbEmployee.getId());
			return repo.save(employee);
		}
		return null;
	}
}
