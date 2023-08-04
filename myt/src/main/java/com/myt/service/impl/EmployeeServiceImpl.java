package com.myt.service.impl;

import com.myt.entity.EmployeeEntity;
import com.myt.exception.EmployeeException;
import com.myt.model.Employee;
import com.myt.repository.EmployeeRepository;
import com.myt.service.EmployeeService;
import com.myt.util.Convertor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    @Override
    public Employee addEmployee(Employee employee) throws EmployeeException {

        EmployeeEntity entity = Convertor.modelToEntity(employee);
        EmployeeEntity employeeEntity = employeeRepository.save(entity);

        return Convertor.entityToModel(employeeEntity);
    }

    @Override
    public Employee updateEmployee(Employee employee)throws EmployeeException {
        return null;
    }

    @Override
    public Employee getEmployeeById(Long id)throws EmployeeException {
        return null;
    }

    @Override
    public List<Employee> getAllEmployee() throws EmployeeException{
        List<EmployeeEntity> entities = employeeRepository.findAll();
        return  Convertor.entityToModel(entities);
    }

    @Override
    public void deleteEmployeeById(Long id) throws EmployeeException {

    }
}
