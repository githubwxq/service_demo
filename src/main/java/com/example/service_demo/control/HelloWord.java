package com.example.service_demo.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class HelloWord {

 
@RequestMapping("/hello")
@ResponseBody
public Object hello(HttpServletRequest request) {

 
return "你好：" + request.getRemoteHost();

}

 
}