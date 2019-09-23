package com.ramesh.hytrix.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HystricsController {

    @RequestMapping("/getname")
    @HystrixCommand(fallbackMethod = "fallback_getname")
    public String getname() throws InterruptedException {
        Thread.sleep(13000);
        return "rangam Ramesh";
    }

    public String fallback_getname(){
        return "The Server responding slowly please try again later.";
    }
}
