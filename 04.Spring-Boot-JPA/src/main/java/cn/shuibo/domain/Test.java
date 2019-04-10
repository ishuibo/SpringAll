package cn.shuibo.domain;

import javax.persistence.*;

/**
 * Author:Bobby
 * DateTime:2019/4/10 15:03
 **/
@Entity
@Table(name = "t_test")
@NamedQuery(name="findByAge", query="select t from Test t where t.age=?1")
@NamedQueries({
        @NamedQuery(name="findAllTest",query="select t from Test t"),
        @NamedQuery(name="findTestWithId",query="SELECT t FROM Test t WHERE t.id = ?1"),
        @NamedQuery(name="findTestWithUsername",query="SELECT t FROM Test t WHERE t.username = :username")
})
public class Test {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "username", unique = true, nullable = false, length = 64)
    private String username;

    @Column(name = "age",unique = true)
    private Integer age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
