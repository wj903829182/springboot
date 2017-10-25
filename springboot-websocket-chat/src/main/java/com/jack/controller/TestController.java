package com.jack.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by jack on 2017/10/25.
 */
@RestController
@RequestMapping("/test")
public class TestController {
    @RequestMapping(value = "/testSession",method = RequestMethod.GET)
    public JSONObject testSession(HttpServletRequest request, HttpServletResponse response){
        System.out.println("session test");
        HttpSession session = request.getSession();
        System.out.println("the session is : "+session.getId());
        Cookie[] cookies = request.getCookies();
        System.out.println("cookies is : "+JSONObject.toJSON(cookies));
        JSONObject json = new JSONObject();
        json.put("success", "session test .");
        return json;
    }
}
