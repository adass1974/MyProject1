package com.example.MyProject1.Employee.dao;

import com.example.MyProject1.Employee.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IEmployeeDAO extends JpaRepository<Employee, Integer> {

    List<Employee> findByDeptName(String deptName);

}
