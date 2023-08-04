package com.myt.controller;

import com.myt.model.Employee;
import com.myt.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RestController( value = "/api/v1/employee")
@RestController
@RequestMapping("/api/v1/employee" )
public class EmployeeController {


   @Autowired
   private EmployeeService employeeService;


  // @PostMapping(path = "/addemployee")
   @PostMapping("/addemployee")

   public Employee addEmployee(@RequestBody Employee employee) {

      return employeeService.addEmployee(employee);
   }

   @PutMapping( "/updateEmployee")
   public Employee updateEmployee(@RequestBody Employee employee) {
       return employeeService.updateEmployee(employee);
   }

   @GetMapping(value = "/getemployeebyid/{id}")
   public Employee getEmployeeById(@PathVariable("id") Long id) {
      return employeeService.getEmployeeById(id);
   }

   @GetMapping(value = "/getallemployee")
   public List<Employee> getAllEmployee() {
      return employeeService.getAllEmployee();
   }

   @DeleteMapping(value = "/deleteEmployeeById/{id}")
   void deleteEmployeeById(@PathVariable("id") Long id) {
       employeeService.deleteEmployeeById(id);
   }

}
