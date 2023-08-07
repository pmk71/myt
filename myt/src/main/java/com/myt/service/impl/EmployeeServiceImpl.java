package com.myt.service.impl;

import java.util.List;

import com.myt.utils.Convertor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myt.entity.EmployeeEntity;
import com.myt.exception.EmployeeException;
import com.myt.model.Employee;
import com.myt.repository.EmployeeRespository;
import com.myt.service.EmployeeService;
@Service
public class EmployeeServiceImpl implements EmployeeService {
@Autowired
    private EmployeeRespository employeeRespository;
    @Override
    public Employee addEmployee(Employee employee) throws EmployeeException {
        EmployeeEntity entity = Convertor.modelToEntity(employee);
        EmployeeEntity employeeEntity = employeeRespository.save(entity);

        return Convertor.entityToModel(employeeEntity);
    }

    @Override
    public Employee getEmployeeById(Long id) throws EmployeeException {
        return null;
    }

    @Override
    public Employee updateEmployee(Employee employee) throws EmployeeException {
        return null;
    }

    @Override
    public void deleteEmployeeByID(Employee employee) throws EmployeeException {

    }



    @Override
    public List<Employee> getAllEmployee(Employee employee) throws EmployeeException {
        return null;
    }
}
