package com.acc.lkm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acc.lkm.dao.EmployeeDAO;
import com.acc.lkm.dao.EmployeeDAOWrapperImpl;
import com.acc.lkm.bean.EmployeeBean;


@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDAO employeeDAO;

	public List<EmployeeBean> getEmployeeList(){

		return employeeDAO.getAllEmployees();
	}

}
