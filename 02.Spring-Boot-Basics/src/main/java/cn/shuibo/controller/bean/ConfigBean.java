package cn.shuibo.controller.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Author:Bobby
 * DateTime:2019/4/2 19:12
 **/
@Component
@ConfigurationProperties(prefix = "bobby")//获取前缀为bobby下的配置信息
public class ConfigBean {

    private String name;//名字与配置文件中一致
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
