package cn.shuibo.controller;

import cn.shuibo.controller.bean.ConfigBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author:Bobby
 * DateTime:2019/4/2 19:01
 **/
@RestController
public class IndexController {

    @Value("${shuibo}")
    private String shuibo;

    @Autowired
    private ConfigBean configBean;

    @RequestMapping("/index")
    public String index(){
        return shuibo;
    }

    @RequestMapping("/config")
    public String config(){
        return "姓名：" + configBean.getName() + ",年龄：" + configBean.getAge();
    }

}

