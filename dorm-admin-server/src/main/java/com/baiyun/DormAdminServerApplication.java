package com.baiyun;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
@MapperScan("com.baiyun.mapper")
public class DormAdminServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DormAdminServerApplication.class, args);
    }

}
