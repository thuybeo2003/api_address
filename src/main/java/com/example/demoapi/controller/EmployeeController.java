package com.example.demoapi.controller;

import com.example.demoapi.model.Employee;
import com.example.demoapi.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private IEmployeeService iEmployeeService;
    @GetMapping("/a")
    public String test1(){
        return "thuybeo";
    }

    @PostMapping("/add")
    public Employee addEmployee(@RequestBody Employee employee){
        return iEmployeeService.addEmployee(employee);
    }
    @PutMapping("/update")
    public Employee updateEmployee(@RequestParam("id") long id,@RequestBody Employee employee){
        return iEmployeeService.updateEmployee(id,employee);
    }
   @DeleteMapping("/delete/{id}")
    public boolean deleteEmployee(@PathVariable("id")long id){
        return iEmployeeService.deleteEmployee(id);
   }
   @GetMapping("/list")
    public List<Employee> getAllEmployee(){
        return iEmployeeService.getAllEmployee();
   }
}
