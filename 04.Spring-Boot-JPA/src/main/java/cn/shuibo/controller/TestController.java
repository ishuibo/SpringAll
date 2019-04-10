package cn.shuibo.controller;

import cn.shuibo.domain.Test;
import cn.shuibo.repository.TestJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Author:Bobby
 * DateTime:2019/4/10 16:30
 **/
@RestController
public class TestController {

    @Autowired
    private TestJpaRepository testJpaRepository;

    public String test(){
        Test test = new Test();
        // 查询全部
        testJpaRepository.findAll();
        // 根据id查询
        testJpaRepository.getOne(1L);
        // 增加
        testJpaRepository.save(test);
        // 删除
        testJpaRepository.delete(test);
        // 数据数量（条）
        testJpaRepository.count();

        return null;
    }


}
