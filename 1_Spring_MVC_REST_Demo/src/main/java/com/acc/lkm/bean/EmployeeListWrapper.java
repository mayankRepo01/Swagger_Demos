package com.acc.lkm.bean;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Employees")
public class EmployeeListWrapper {
	
	private List<EmployeeBean> listEmp;

	@XmlElement(name="Employee")
	public List<EmployeeBean> getListEmp() {
		return listEmp;
	}

	public void setListEmp(List<EmployeeBean> listEmp) {
		this.listEmp = listEmp;
	}
	
	

}
