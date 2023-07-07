package com.emplyee.original.EmployeeDetails.model;

import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import lombok.Data;
import lombok.NoArgsConstructor;


@Transactional
@NoArgsConstructor
@Entity
@Table(name = "address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "add_Id")
    private Long address_id;

    private String city;

    private String address_Type;

    public String getCity() {
        return city;
    }

    public String getAddress_Type() {
        return address_Type;
    }

    public Address(String city, String address_Type) {
        this.city = city;
        this.address_Type = address_Type;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setAddress_Type(String address_Type) {
        this.address_Type = address_Type;
    }
}
