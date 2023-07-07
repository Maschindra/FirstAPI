package com.emplyee.original.EmployeeDetails.model;


import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Transactional
@NoArgsConstructor
@Entity
@Getter
@Setter
@Table(name = "employ_Details")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "emp_Id")
    private Long emp_Id;
    private  String emp_Name;
    private int age;
    @OneToOne(cascade = CascadeType.ALL)
    private Address address;

    public Address getAddress() {
        return address;
    }

    public Employee(String emp_Name, int age) {
        this.emp_Name = emp_Name;
        this.age = age;
    }

    public void setEmp_Name(String emp_Name) {
        this.emp_Name = emp_Name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
