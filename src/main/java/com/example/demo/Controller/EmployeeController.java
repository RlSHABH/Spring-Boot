package com.example.demo.Controller;

import com.example.demo.model.Employee;
import com.example.demo.Service.EmployeeService;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

  @Autowired private EmployeeService employeeService;

  @RequestMapping(value = "/add-employee", method = RequestMethod.POST)
  public String addEmployee(@Valid @RequestBody Employee employee) {
    return employeeService.addEmployee(employee);


  }
}
