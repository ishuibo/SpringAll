package cn.shuibo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Author:Bobby
 * DateTime:2019/4/3 16:06
 **/
@RestController
public class TestController {

    @RequestMapping("/test")
    public ModelAndView test(){
        return new ModelAndView("test");
    }
}
