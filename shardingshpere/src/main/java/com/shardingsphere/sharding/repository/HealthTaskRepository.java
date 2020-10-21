package com.shardingsphere.sharding.repository;

import com.shardingsphere.sharding.entity.HealthTask;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface HealthTaskRepository extends BaseRepository<HealthTask, Long> {
}
