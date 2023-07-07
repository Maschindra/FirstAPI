package com.emplyee.original.EmployeeDetails.controller;

import com.emplyee.original.EmployeeDetails.model.Address;
import com.emplyee.original.EmployeeDetails.model.Employee;
import com.emplyee.original.EmployeeDetails.service.EmployService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping(value = "/employDetails")
public class EmployController {
     @Autowired
     EmployService employService;

    @PostMapping("/employ")
    public ResponseEntity<Employee> saveEmploy(@RequestBody Employee employee){
        Address add=new Address();
        employee.setAddress(employee.getAddress());
        return new ResponseEntity<Employee>(employService.saveAll(employee), HttpStatus.CREATED);
    }


}
