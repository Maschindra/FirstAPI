package com.emplyee.original.EmployeeDetails.repository;

import com.emplyee.original.EmployeeDetails.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployRepo extends JpaRepository<Employee,Long> {
}
