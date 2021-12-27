package com.example.lkm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.lkm.dao.EmployeeDao;
import com.example.lkm.entity.Employee;
import com.example.lkm.service.EmployeeService;

@RestController
public class MyController {
	@Autowired
	EmployeeService empService;
	
	@GetMapping(path="/employee/{id}")
	public Employee getEmployee(@PathVariable int id)
	{
		Employee e=empService.findById(id).orElse(new Employee());
		return e;
	}
	
	@GetMapping(path="/employees")
	public List<Employee> getEmployees()
	{
		List<Employee> list=empService.findAll();
		return list;
	}
	

	@PostMapping(path="/employee",produces ="application/json",consumes = "application/json")
	public Employee saveEmployee(@RequestBody Employee e)
	{
		Employee emp=empService.save(e);
		return emp;
	}
	
	
	@DeleteMapping(path="/employee/{id}")
	public String deletEmployee(@PathVariable int id)
	{
		Employee e=empService.getById(id);
		empService.delete(e);
		return "Employee is deleted";
	}
	

	@PutMapping(path="/employee")
	public Employee updateEmployee(@RequestBody Employee e)
	{
		Employee emp=empService.save(e);
		return emp;
	}
}
