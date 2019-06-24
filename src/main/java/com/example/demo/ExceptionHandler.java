package com.example.demo;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RestController;

@ControllerAdvice
public class ExceptionHandler {

@org.springframework.web.bind.annotation.ExceptionHandler
 public void  handleException(Exception exception)
  {
    System.out.println("abc");
  }
}
