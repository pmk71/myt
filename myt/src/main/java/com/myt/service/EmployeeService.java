package com.myt.service;

import com.myt.exception.EmployeeException;
import com.myt.model.Employee;
import com.myt.repository.EmployeeRespository;
import org.springframework.stereotype.Service;

import java.util.List;

public interface EmployeeService {

    public Employee addEmployee(Employee employee) throws EmployeeException;
    public Employee getEmployeeById(Long id) throws EmployeeException;
    public Employee updateEmployee(Employee employee) throws EmployeeException;
    public void deleteEmployeeByID(Employee employee) throws EmployeeException;
    public  List<Employee>getAllEmployee(Employee employee) throws EmployeeException;
}
