package com.myt.utils;

import com.myt.entity.EmployeeEntity;
import com.myt.model.Employee;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import java.util.List;
import java.util.stream.Collectors;


@Component
public class Convertor {
    public static Employee entityToModel(EmployeeEntity entity) {
        Employee employee = new Employee();
        employee.setEmpId(entity.getEmpId());
        employee.setEmpFirstName(entity.getEmpFirstName());
        employee.setEmpLastName(entity.getEmpLastName());
        employee.setEmpEmailId(entity.getEmpEmailId());
        return employee;
    }

    public static EmployeeEntity modelToEntity(Employee employee) {
        EmployeeEntity entity = new EmployeeEntity();
        entity.setEmpFirstName(employee.getEmpFirstName());
        entity.setEmpLastName(employee.getEmpLastName());
        entity.setEmpEmailId(employee.getEmpEmailId());
        return entity;
    }

    public static List<Employee> entityToModel(List<EmployeeEntity> employeeEntities) {
        List<Employee> employees = employeeEntities.stream()
                .map(e -> entityToModel(e))
                .collect(Collectors.toList());
        return employees;
    }
}