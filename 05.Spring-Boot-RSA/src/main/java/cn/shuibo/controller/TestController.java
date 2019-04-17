package cn.shuibo.controller;

import cn.shuibo.annotation.Decrypt;
import cn.shuibo.annotation.Encrypt;
import cn.shuibo.bean.TestBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author:Bobby
 * DateTime:2019/4/17 15:22
 **/
@RestController
public class TestController {

    /**
     * 对返回值加密
     * @return
     */
    @Encrypt
    @GetMapping("/test01")
    public TestBean test01(){
        TestBean testBean = new TestBean();
        testBean.setName("shuibo.cn");
        testBean.setAge(18);
        return testBean;
    }

    /**
     * 对传过来的加密参数进行解密
     * @param testBean
     * @return
     */
    @Decrypt
    @PostMapping("/test02")
    public String test02(@RequestBody TestBean testBean){
        return testBean.toString();
    }

}
