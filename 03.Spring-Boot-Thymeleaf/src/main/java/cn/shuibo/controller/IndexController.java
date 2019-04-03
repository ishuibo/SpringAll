package cn.shuibo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Author:Bobby
 * DateTime:2019/4/3 16:01
 **/
@Controller
public class IndexController {

    @RequestMapping("index")
    public String index(){
        return "index";
    }

}
