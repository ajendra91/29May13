package com.example.Security;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {


    @RequestMapping("/")
    public String hello(){
        return "ajendra is here";
    }

    @RequestMapping("/dash1")
    public String dash1(){
        return "dash1";
    }

    @RequestMapping("/dash2")
    public String dash2(){
        return "dash2";
    }


}
