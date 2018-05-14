package com.xmqbeast.log.log4j2.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.xmqbeast.log.log4j2.service.LoggerService;

import javax.annotation.Resource;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/log")
public class ApiController {

    @Resource
    private LoggerService loggerService;


    @RequestMapping("/show")
    public Map<String,Object> shotLog(@RequestParam("name")String name,@RequestParam("age") int age){
        Map<String,Object> result = new HashMap<>();
        result.put("name",name);
        result.put("age",age);

        loggerService.showLog();
        
        return result;
    }

    @RequestMapping("/show2")
    public Map<String,Object> shotLog(@RequestBody String parms){
        Map<String,Object> result = new HashMap<>();
//        result.put("name",name);
//        result.put("age",age);
//        System.out.println(parms);
        loggerService.showLog();
        return result;
    }


}
