package com.jack.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jack on 2017/7/20.
 */
@RestController
public class HelloConroller {
   /* @Autowired
    HelloRemote helloRemote;*/
   /* @Autowired
    RestTemplate restTemplate;*/
   //@Autowired

    @RequestMapping(value = "/hello")
    public String hello(){
        //return helloRemote.helloProvider();
        return "hello,world";
    }
   /* @RequestMapping(value = "/hello2")
    public String hello2(){
        return restTemplate.getForEntity("http://spring-cloud-producer/hello/provider", String.class).getBody();
    }*/
}
