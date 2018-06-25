package com.gps.controller;  
  
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.gps.service.UserService;
  
@RestController
@RequestMapping("/test")
public class MainController {  
	  @Autowired
	  private UserService userService; 
	
      @RequestMapping("/")  
      @ResponseBody  
      String home() {  
        return userService.getUserInfo().toString();  
      }  
}  