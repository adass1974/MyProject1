package com.example.MyProject1.Employee.model;


import javax.persistence.*;
import java.util.Date;

@Entity
public class Employee {
    @Id
    @GeneratedValue
    private int empId;
    private String empName;
    private int empPay;

    private String deptName;

    public Employee(){

    }

    public Employee(int empId, String empName, int empPay, String deptName){
        super();
        this.empId = empId;
        this.empName = empName;
        this.empPay = empPay;
        this.deptName = deptName;
    }
    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpPay() {
        return empPay;
    }

    public void setEmpPay(int empPay) {
        this.empPay = empPay;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String jobTitle) {
        this.deptName = deptName;
    }

    @Override
    public String toString() {
        return "Employee [empId=" + empId + ", empName=" + empName + ", empPay=" + empPay + ", deptName=" + deptName + "]";
    }
}
