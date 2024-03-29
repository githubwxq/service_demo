package com.example.service_demo.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import com.example.service_demo.domain.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

    @RequestMapping("/test")
    public Map<String,String> testMap(){
    	Map<String,String> map = new HashMap<>();
    	map.put("name", "xdclass");
    	return map;
    }
    
    
    @GetMapping("/testjson")
    public Object testjson(){
    	
    	return new User(222, "abc123", "10001000", new Date());
    }
    
    
    
    
}