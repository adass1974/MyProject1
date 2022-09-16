package com.example.MyProject1.Employee.EmployeeController;


import com.example.MyProject1.Employee.EmployeeService.EmployeeServiceImpl;
import com.example.MyProject1.Employee.model.Employee;
import com.example.MyProject1.Employee.EmployeeService.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class EmployeeController {

    @Autowired
    IEmployeeService serviceRef;


    @RequestMapping("/")
    public String getHomePage(Model model) {
        model.addAttribute("successfulMsg", "Welcome to The Employee Page / Code");

        return "Homepage";
    }

    @RequestMapping("/addNewEmployee")
    public String addNewEmployeePage(Model model) {
        model.addAttribute("employee", new Employee());
        return "NewEmployee";
    }

    @RequestMapping("/addEmployeeDetails")
    public String addEmployeeDetails(@ModelAttribute("employee") Employee employee, BindingResult result, Model model) {

        if (result.hasErrors()) {
            return "NewEmployee";
        } else {
            serviceRef.addEmployee(employee);
            model.addAttribute("successMsg", "Data Inserted Successfully");
            return "Homepage";

        }
    }

    @RequestMapping("/getAllEmployee")
    public String getEmployeeList(Model model) {
        List<Employee> empList = new ArrayList<Employee>();
        empList = serviceRef.getAllEmployee();
        model.addAttribute("employeeList", empList);
        return "employeeview";
    }

    @RequestMapping(value = "/employee", method = RequestMethod.GET)
    public String Employee(Model model, @RequestParam("empId") int empId) {
        Employee emp = serviceRef.getEmployeeById(empId);
        System.out.println("Before view " + emp);
        model.addAttribute("employeeData", emp);
        return "EmployeeOperation";
    }

    @RequestMapping("/updateEmployee")
    public String updateEmployee(Model model, @RequestParam("empId") int empId) {
        Employee emp = serviceRef.getEmployeeById(empId);
        System.out.println("in update Emp" + emp);
        model.addAttribute("employeeDetails", emp);
        return "updateEmployeePage";
    }

    @RequestMapping("/updateEmployeeDetails")
    public String updateEmployeeDetail(@ModelAttribute("employee") Employee employee, BindingResult result, Model model) {

        if (result.hasErrors()) {
            return "NewEmployee";
        } else {
            System.out.println(employee);
            serviceRef.updateEmployee(employee, employee.getEmpId());
            model.addAttribute("successMsg", "Employee Updated Successfully");

            return "Homepage";
        }

    }

    @RequestMapping("/deleteEmployee")
    public String deleteEmployee(Model model, @RequestParam("empId") int empId){
        System.out.println("in delete Emp"+empId);
        serviceRef.deleteEmployee(empId);
        model.addAttribute("successMsg","Employee Deleted Successfully");

        return "Homepage";


       // creating a POST mapping that saves all the Boss detail from the database
        //@PostMapping("/employee")
        //private int saveEmployee(@RequestBody Employee Object employee;
        //employee){
        //    EmployeeServiceImpl.saveOrUpdate(saveEmployee);
        //   return employee.getid();
        //}
    }
}
