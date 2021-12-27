package com.example.lkm.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lkm.dao.EmployeeDao;
import com.example.lkm.entity.Employee;

@Service
public class EmployeeService {

	@Autowired
	EmployeeDao dao;

	public Employee save(Employee e) {
		return dao.save(e);
	}

	public Optional<Employee> findById(int id) {
		return dao.findById(id);

	}

	public List<Employee> findAll() {
		return dao.findAll();

	}
	
	public Employee getById(int id)
	{
		return dao.getById(id);
	}
	
	public void delete(Employee e)
	{
		dao.delete(e);
	}
	
	
}
