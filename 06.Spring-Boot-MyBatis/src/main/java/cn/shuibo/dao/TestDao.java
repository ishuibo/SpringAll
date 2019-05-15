package cn.shuibo.dao;

import cn.shuibo.domain.Test;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: Bobby
 * @Date: 2019/5/15 10:57
 */
@Component
@Mapper
@Repository
public interface TestDao {

    @Insert("insert into test(name,age) values(#{name},#{age})")
    int addTest(Test test);

    @Update("update test set name=#{name},age=#{age} where id=#{id}")
    int updateTest(@Param("name")String name,@Param("age")int age,@Param("id")int id);

    @Delete("delete from test where id=#{id}")
    int deleteTestById(@Param("id")int id);

    @Select("select * from test where id = #{id}")
    Test findTestById(@Param("id")int id);

    Test getTestById(int id);

    int updateTest(Test test);

    int insertTest(Test test);

    int deleteTestByIds(int id);
}
