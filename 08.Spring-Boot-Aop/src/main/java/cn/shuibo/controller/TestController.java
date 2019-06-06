package cn.shuibo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Bobby
 * @Date: 2019/6/6 16:44
 */
@RestController
public class TestController {

    @GetMapping(value = "/index")
    public String index(String text){
        String shuibo = "shuibo.cn";
        if(shuibo.equals(text)){
            shuibo = "https://shuibo.cn";
        }else{
            shuibo = "http://shuibo.cn";
        }
        return shuibo;
    }
}
