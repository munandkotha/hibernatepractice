package org.practice.eintities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Employees")
public class Employee {
    @Id
    @Column(name = "e_id")
    private int eId;
    @Column(name = "e_name")
    private String eName;
    @Column(name = "e_salary")
    private double eSalary;
    @Column(name = "e_address")
    private String eAddress;

    public int geteId() {
        return eId;
    }

    public void seteId(int eId) {
        this.eId = eId;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public double geteSalary() {
        return eSalary;
    }

    public void seteSalary(double eSalary) {
        this.eSalary = eSalary;
    }

    public String geteAddress() {
        return eAddress;
    }

    public void seteAddress(String eAddress) {
        this.eAddress = eAddress;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eId=" + eId +
                ", eName='" + eName + '\'' +
                ", eSalary=" + eSalary +
                ", eAddress='" + eAddress + '\'' +
                '}';
    }
}
