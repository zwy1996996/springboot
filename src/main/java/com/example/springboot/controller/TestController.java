package com.example.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 *
 * @author Administrator
 * @date 2022/3/19 14:59
 */

@RestController
@RequestMapping("/test/")
public class TestController {
    @RequestMapping("demo")
    public void demo (){
        System.out.println("旧时代的残党,新世界没有能载你的船!");
    }
}
