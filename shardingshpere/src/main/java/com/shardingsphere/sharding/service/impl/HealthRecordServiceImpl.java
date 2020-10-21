package com.shardingsphere.sharding.service.impl;

import com.shardingsphere.sharding.entity.HealthRecord;
import com.shardingsphere.sharding.entity.HealthTask;
import com.shardingsphere.sharding.repository.HealthRecordRepository;
import com.shardingsphere.sharding.repository.HealthTaskRepository;
import com.shardingsphere.sharding.service.HealthRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Service
public class HealthRecordServiceImpl implements HealthRecordService {

    @Autowired
    private HealthRecordRepository healthRecordRepository;

    @Autowired
    private HealthTaskRepository healthTaskRepository;

    @Override
    public void processHealthRecords() throws SQLException {
        insertHealthRecords();
    }

    private List<Long> insertHealthRecords() throws SQLException  {
        List<Long> result = new ArrayList<>(10);
        for (long i = 0; i <= 10; i++) {
            HealthRecord healthRecord = insertHealthRecord(i);
            insertHealthTask(i, healthRecord);
            result.add(healthRecord.getRecordId());
        }
        return result;
    }

    private HealthRecord insertHealthRecord(long userId) throws SQLException {
        HealthRecord healthRecord = new HealthRecord();
        healthRecord.setUserId(userId);
        healthRecord.setLevelId(userId % 5);
        healthRecord.setRemark("Remark" + userId);
        healthRecordRepository.addEntity(healthRecord);
        return healthRecord;
    }

    private void insertHealthTask(long userId, HealthRecord healthRecord) throws SQLException {
        HealthTask healthTask = new HealthTask();
        healthTask.setRecordId(healthRecord.getRecordId());
        healthTask.setUserId(userId);
        healthTask.setTaskName("TaskName" + userId);
        healthTaskRepository.addEntity(healthTask);
    }

}
