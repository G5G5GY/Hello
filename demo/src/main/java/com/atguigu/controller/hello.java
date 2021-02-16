package com.atguigu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author GQGQ
 * @data 2021/2/15 0:07
 */
@Controller
public class hello {
    @ResponseBody
    @RequestMapping("/hello")
    public String springbootHello(){
        return "hello";
    }
}
