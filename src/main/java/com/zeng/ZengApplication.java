package com.zeng;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author cenghongyang
 */
@MapperScan("com.zeng.dao")
@ComponentScan("com.zeng.*")

@SpringBootApplication
public class ZengApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZengApplication.class, args);
    }

}
