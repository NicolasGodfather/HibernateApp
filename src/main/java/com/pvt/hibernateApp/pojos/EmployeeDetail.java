package com.pvt.hibernateApp.pojos;

import java.io.Serializable;

/**
 * Realization
 *
 * @author Nicolas Asinovich.
 */
public class EmployeeDetail implements Serializable {
    private static final long serialVersionUID = 7L;

    private Long employeeId;

    private Employee employee;

    public Long getEmployeeId () {
        return employeeId;
    }

    public void setEmployeeId (Long employeeId) {
        this.employeeId = employeeId;
    }

    public Employee getEmployee () {
        return employee;
    }

    public void setEmployee (Employee employee) {
        this.employee = employee;
    }
}
