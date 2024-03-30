package com.tutofox.Employee_Rutuja.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tutofox.Employee_Rutuja.entity.Employee;

@Repository
public interface Repo extends JpaRepository<Employee, Integer>{

}
