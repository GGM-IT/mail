package com.jc.demo.comtroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author geng
 * @data 2019/6/3/20:14
 */
@RestController
public class Hello {
    @RequestMapping("/hello")
    public String hello(){
        return "heoo";
    }
    @RequestMapping("/helloo")
    public String helloo(){
        return "heoo";
    }
}
