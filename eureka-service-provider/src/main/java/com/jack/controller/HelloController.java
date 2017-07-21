package com.jack.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jack on 2017/7/20.
 */
@RestController
public class HelloController {
    @RequestMapping(value = "/hello/provider")
    public String helloProvider(){
        return "I am is provider ,hello world";
    }
}
