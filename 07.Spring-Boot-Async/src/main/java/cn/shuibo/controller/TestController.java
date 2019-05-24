package cn.shuibo.controller;

import cn.shuibo.service.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Bobby
 * @Date: 2019/5/24 15:45
 */
@RestController
public class TestController {

    private final static Logger logger = LoggerFactory.getLogger(TestController.class);
    @Autowired
    TestService testService;

    /**
     * 同步方法 等候6秒后返回
     * @return
     */
    @GetMapping("/synchroEvent")
    public String test(){
        long start = System.currentTimeMillis();
        try {
            testService.synchroEvent();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        logger.info("同步方法用时：{}",end-start);
        return "成功";
    }

    /**
     * 异步方法 即时返回（后台处理）
     * @return
     */
    @GetMapping("/asyncEvent")
    public String test1(){
        long start = System.currentTimeMillis();
        try {
            testService.asyncEvent();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        logger.info("异步方法用时：{}",end-start);
        return "成功";
    }
}
