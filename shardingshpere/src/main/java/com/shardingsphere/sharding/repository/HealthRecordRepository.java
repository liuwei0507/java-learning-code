package com.shardingsphere.sharding.repository;

import com.shardingsphere.sharding.entity.HealthRecord;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface HealthRecordRepository extends BaseRepository<HealthRecord, Long> {
}
