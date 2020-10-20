package com.shardingsphere.repository;

import com.shardingsphere.entity.HealthTask;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
public interface HealthTaskRepository extends BaseRepository<HealthTask, Long> {
}
