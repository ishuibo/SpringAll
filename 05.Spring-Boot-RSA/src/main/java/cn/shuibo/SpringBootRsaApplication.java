package cn.shuibo;

import cn.shuibo.annotation.EnableSecurity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableSecurity
public class SpringBootRsaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootRsaApplication.class, args);
    }

}
