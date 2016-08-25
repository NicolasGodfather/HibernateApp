package com.pvt.hibernateApp.pojos;

import java.io.Serializable;

/**
 * Realization
 *
 * @author Nicolas Asinovich.
 */
public class Employee extends Person implements Serializable {
    private static final long serialVersionUID = 6L;

    private Address address;
    private EmployeeDetail employeeDetail;

    public Address getAddress () {
        return address;
    }

    public void setAddress (Address address) {
        this.address = address;
    }

    public EmployeeDetail getEmployeeDetail () {
        return employeeDetail;
    }

    public void setEmployeeDetail (EmployeeDetail employeeDetail) {
        this.employeeDetail = employeeDetail;
    }
}
