package com.example.demo.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by admin on 2018/6/12.
 */
@RestController
public class testContr {
    @RequestMapping(value = "/hello")
    public String hello() {
        return "hello,Spring Boot";
    }
}
