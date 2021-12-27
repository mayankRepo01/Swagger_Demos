package com.acc.lkm.web.Controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.acc.lkm.bean.EmployeeBean;
import com.acc.lkm.bean.EmployeeListWrapper;
import com.acc.lkm.service.EmployeeService;



@RestController
public class RestController4 {
	
	@Autowired
	private EmployeeService employeeService;

	
	@RequestMapping(value = "/restController4/json/getDetails", method = RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<EmployeeBean>> getAllEmployees() {
		
	return new ResponseEntity<List<EmployeeBean>>(employeeService.getEmployeeList(),HttpStatus.OK);
	}

	@RequestMapping(value = "/restController4/xml/getDetails", method = RequestMethod.GET,produces=MediaType.APPLICATION_XML_VALUE)
	public ResponseEntity<EmployeeListWrapper> getAllEmployees2() {
		
	List<EmployeeBean> list= employeeService.getEmployeeList();
	EmployeeListWrapper employeeListWrapper=new EmployeeListWrapper();
	employeeListWrapper.setListEmp(list);
	return new ResponseEntity<EmployeeListWrapper>(employeeListWrapper,HttpStatus.OK);
	}

}
