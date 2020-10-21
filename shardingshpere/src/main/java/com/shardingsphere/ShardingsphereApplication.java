package com.shardingsphere;

import com.shardingsphere.sharding.entity.User;
import com.shardingsphere.sharding.service.UserService;
import com.shardingsphere.transaction.TransactionService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

@MapperScan(basePackages = "com.shardingsphere.sharding.repository")
@SpringBootApplication
class ShardingsphereApplication {

    public static void main(String[] args) {
        try (ConfigurableApplicationContext applicationContext = SpringApplication.run(ShardingsphereApplication.class, args)) {
//            UserService userService = applicationContext.getBean(UserService.class);
//            userService.processUsers();
//            List<User> users = userService.getUsers();
//            System.out.println(users);

//        	HealthLevelService healthLevelService = applicationContext.getBean(HealthLevelService.class);
//        	healthLevelService.processLevels();
//
//        	HealthRecordService healthRecordService = applicationContext.getBean(HealthRecordService.class);
//        	healthRecordService.processHealthRecords();

//        	HintService hintService = applicationContext.getBean(HintService.class);
//        	hintService.processWithHintValueForShardingDatabases();
//        	hintService.processWithHintValueForShardingDatabasesAndTables();
//        	hintService.processWithHintValueMaster();

            TransactionService transactionService = applicationContext.getBean(TransactionService.class);
            transactionService.processWithXA();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
