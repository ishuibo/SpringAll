package cn.shuibo.service.impl;

import cn.shuibo.dao.TestDao;
import cn.shuibo.domain.Test;
import cn.shuibo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: Bobby
 * @Date: 2019/5/15 15:26
 */
@Service("testService")
public class TestServiceImpl implements TestService {

    @Autowired
    private TestDao testDao;

    @Override
    public Test findTestById(int id) {
        return testDao.findTestById(id);
    }

    @Override
    public int addTest(Test test) {
        return testDao.addTest(test);
    }

    @Override
    public int updateTest(String name, int age, int id) {
        return testDao.updateTest(name,age,id);
    }

    @Override
    public int deleteTestById(int id) {
        return testDao.deleteTestById(id);
    }

    @Override
    public Test getTestById(int id) {
        return testDao.getTestById(id);
    }

}
