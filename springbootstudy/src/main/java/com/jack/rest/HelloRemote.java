package com.jack.rest;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by jack on 2017/7/20.
 */
//@FeignClient(name= "spring-cloud-producer")
public interface HelloRemote {
   /* @RequestMapping(value = "/hello/provider")
    public String helloProvider();*/
}
