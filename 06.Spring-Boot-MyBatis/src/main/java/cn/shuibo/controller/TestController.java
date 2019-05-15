package cn.shuibo.controller;

import cn.shuibo.domain.Test;
import cn.shuibo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Bobby
 * @Date: 2019/5/15 10:57
 */
@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String getTest(){
        Test test = testService.findTestById(1);
        return test.toString();
    }

    @RequestMapping(value = "/test1", method = RequestMethod.GET)
    public String getTest1(){
        Test test = testService.getTestById(1);
        return test.toString();
    }
}
