package com.emplyee.original.EmployeeDetails.service;

import com.emplyee.original.EmployeeDetails.model.Employee;
import com.emplyee.original.EmployeeDetails.repository.EmployRepo;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Component
public interface EmployService  {

    public Employee saveAll(Employee employee);
}
