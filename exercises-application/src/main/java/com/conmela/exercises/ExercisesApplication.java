package com.conmela.exercises;

import lombok.extern.java.Log;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.core.env.Environment;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Log
@EnableCaching
public class ExercisesApplication {

    public static void main(String[] args) {
        SpringApplication app= new SpringApplication(ExercisesApplication.class);
        Environment env = app.run(args).getEnvironment();
        log.info("个人练习项目启动成功");
        System.out.println("文档路径：\t\thttp://localhost:"+env.getProperty("server.port")+"/doc.html");
    }

}
