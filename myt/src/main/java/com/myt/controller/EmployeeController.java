package com.myt.controller;

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

import com.myt.model.Employee;
import com.myt.service.EmployeeService;
@RestController
@RequestMapping("/api/v1/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@PostMapping("/addemployee")
	public Employee addEmployee(@RequestBody Employee employee)
	{
		return employeeService.addEmployee(employee);
	}

	@GetMapping(value = "/getemployeebyid/{id}")
	public Employee getEmployeeById(@PathVariable("id") Long id)
	{
		return employeeService.getEmployeeById(id);
	}

	@PutMapping("/updateemployee")
	public Employee updateEmployee(@RequestBody Employee employee)
	{
		return employeeService.updateEmployee(employee);
	}

	@DeleteMapping(value = "/deleteemployeebyid/{id}")

	public void deleteEmployeeById(@PathVariable ("id") Long id)
	{

	}
	@GetMapping("/getAllEmployee")
	public List<Employee> getAllEmployee(@RequestBody Employee employee)
	{
		return  employeeService.getAllEmployee(employee);
	}
}
