package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;

@RestController
@RequestMapping("API")
public class TestAPI {


    @RequestMapping("/get-info")
    @ResponseBody
    public  String getUserInfo(){



        return  "张三";

    }

}
