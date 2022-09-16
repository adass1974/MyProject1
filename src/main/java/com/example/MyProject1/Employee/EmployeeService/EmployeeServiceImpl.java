package com.example.MyProject1.Employee.EmployeeService;


import com.example.MyProject1.Employee.model.Employee;
import com.example.MyProject1.Employee.dao.IEmployeeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements IEmployeeService{

    /*List<Employee> empList = new ArrayList<>(Arrays.asList(
            new Employee(1,"Anoop",30000,"Payments"),
            new Employee(2,"Siddharth", 45000, "DSOS"),
            new Employee(3,"Rohit",50000,"PCF")));*/

    @Autowired
    private IEmployeeDAO daoRef;

    @Override
    public List<Employee> getAllEmployee() {
        return daoRef.findAll();
    }
    @Override
    public Employee getEmployeeById(int empId) {
        return daoRef.getReferenceById(empId);
    }
    @Override
    public void addEmployee(Employee employee) {
    }

    @Override
    public void updateEmployee(Employee employee, int empId) {
        daoRef.save(employee);
    }

    @Override
    public void deleteEmployee(int empId) {
        daoRef.deleteById(empId);
    }
    @Override
    public List<Employee> getEmployeeByDept(String deptName) {
        return daoRef.findByDeptName(deptName);
    }
}
