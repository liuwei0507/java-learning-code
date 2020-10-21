package com.shardingsphere;

import com.shardingsphere.entity.User;
import com.shardingsphere.service.HealthRecordService;
import com.shardingsphere.service.UserService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.sql.SQLException;
import java.util.List;

@MapperScan(basePackages = "com.shardingsphere.repository")
@SpringBootApplication
class ShardingsphereApplication {

    public static void main(String[] args) throws SQLException {
        try (ConfigurableApplicationContext applicationContext = SpringApplication.run(ShardingsphereApplication.class, args)) {
            UserService userService = applicationContext.getBean(UserService.class);
            HealthRecordService healthRecordService = applicationContext.getBean(HealthRecordService.class);
            userService.processUsers();
            healthRecordService.processHealthRecords();
            List<User> users = userService.getUsers();
            System.out.println(users);
        }
    }

}
