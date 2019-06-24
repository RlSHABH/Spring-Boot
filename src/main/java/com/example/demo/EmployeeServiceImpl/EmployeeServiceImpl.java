package com.example.demo.EmployeeServiceImpl;

import com.example.demo.Repository.EmployeeRepository;
import com.example.demo.Service.EmployeeService;
import com.example.demo.model.Employee;
import java.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

  @Autowired private EmployeeRepository employeeRepository;


  @Override public String  addEmployee(Employee employee) {
    employeeRepository.save(employee);

    return  LocalDateTime.now().toString();
  }

}
