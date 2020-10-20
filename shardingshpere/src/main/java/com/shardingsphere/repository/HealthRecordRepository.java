package com.shardingsphere.repository;

import com.shardingsphere.entity.HealthRecord;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
public interface HealthRecordRepository extends BaseRepository<HealthRecord, Long> {
}
