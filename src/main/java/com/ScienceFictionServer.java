package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.veeja.mapper")
public class ScienceFictionServer {
    public static void main(String[] args) {
        SpringApplication.run(ScienceFictionServer.class, args);
    }
}
