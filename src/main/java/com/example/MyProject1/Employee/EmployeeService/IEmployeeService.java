package com.example.MyProject1.Employee.EmployeeService;

import com.example.MyProject1.Employee.model.Employee;

import java.util.List;


public interface IEmployeeService {
    List<Employee> getAllEmployee();
    Employee getEmployeeById(int empId);
    void addEmployee(Employee employee);
    void updateEmployee(Employee employee, int empId);
    void deleteEmployee(int empId);
    List<Employee> getEmployeeByDept(String deptName);


}
