package com.offcn.docker_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: docker_demo
 * @description:
 * @author: 刘博
 * @create: 2020-07-30 20:13
 **/
@RestController
public class TestController {
    @GetMapping("test")
    public  String test(){
        return "hello docker";

    }
}
