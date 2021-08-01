package com.guard;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.guard.dao")
public class GuardApplication {

    public static void main(String[] args) {
        SpringApplication.run(GuardApplication.class,args);
        System.out.println("////////////////////////////////////////////////////////////////////\n"+
                "//                             项目启动成功                         //\n"+
                "///////////////////////////////////////////////////////////////////");
        System.out.println("http://localhost:8082/index");
    }
}
