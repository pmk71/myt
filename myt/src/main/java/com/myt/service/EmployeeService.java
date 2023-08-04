package com.myt.service;

import com.myt.exception.EmployeeException;
import com.myt.model.Employee;

import java.util.List;

public interface EmployeeService {

    public Employee addEmployee(Employee employee) throws EmployeeException;
    public Employee updateEmployee(Employee employee) throws EmployeeException;
    public Employee getEmployeeById(Long id) throws EmployeeException;

    public List<Employee> getAllEmployee() throws EmployeeException;
    public void deleteEmployeeById(Long id) throws EmployeeException;
}
