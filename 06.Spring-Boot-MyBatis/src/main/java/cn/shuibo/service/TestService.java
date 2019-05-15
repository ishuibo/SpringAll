package cn.shuibo.service;

import cn.shuibo.domain.Test;

/**
 * @Author: Bobby
 * @Date: 2019/5/15 10:55
 */
public interface TestService {

    Test findTestById(int id);

    int addTest(Test test);

    int updateTest(String name,int age,int id);

    int deleteTestById(int id);

    Test getTestById(int id);
}
