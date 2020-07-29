package com.nmbiss.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author rong
 * @version 1.0
 * @date 2020/7/29 13:26
 */
@RequestMapping("/test")
@ResponseBody
public class TestController {
    @RequestMapping("/hello")
    public String test(){
        return "index12.html";
    }
}
