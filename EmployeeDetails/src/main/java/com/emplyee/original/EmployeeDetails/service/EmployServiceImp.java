package com.emplyee.original.EmployeeDetails.service;

import com.emplyee.original.EmployeeDetails.model.Employee;
import com.emplyee.original.EmployeeDetails.repository.EmployRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployServiceImp implements EmployService{


    @Autowired
    public EmployRepo employRepo;
    @Override
    public Employee saveAll(Employee employee) {
      return employRepo.save(employee);
    }
}
