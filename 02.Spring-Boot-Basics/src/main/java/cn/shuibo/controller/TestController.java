package cn.shuibo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Author:Bobby
 * DateTime:2019/4/2 19:24
 **/
@Controller
public class TestController {

    @RequestMapping("/index/test")
    public String test(){
        return "/index";
    }
}
