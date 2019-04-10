package cn.shuibo.repository;

import cn.shuibo.domain.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Author:Bobby
 * DateTime:2019/4/10 16:29
 **/
public interface TestJpaRepository extends JpaRepository<Test, Long> {

    /**
     * 通过username查询
     * @param username username
     * @return
     */
    List<Test> findByUsername(String username);

    /**
     * 通过username + age查询
     * @param username username
     * @param age age
     * @return
     */
    List<Test> findByUsernameAndAge(String username,Integer age);

    /**
     * 查询符合年龄条件的前10条数据
     * @param age
     * @return
     */
    List<Test> findFirst10ByAge(Integer age);

    /**
     * 查询符合Name条件的前10条数据
     * @param username
     * @return
     */
    List<Test> findTop10ByUsername(String username);

    @Query("select t from Test t where t.username=?1 and t.age=?2")
    List<Test> getAllByUsernameAndAge(String username,Integer age);

    @Modifying
    @Query("update Test t set t.username=?1")
    int setUserName(String username);
}
