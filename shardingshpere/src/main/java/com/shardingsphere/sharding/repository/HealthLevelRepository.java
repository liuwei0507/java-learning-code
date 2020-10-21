package com.shardingsphere.sharding.repository;

import com.shardingsphere.sharding.entity.HealthLevel;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface HealthLevelRepository extends BaseRepository<HealthLevel, Long> {
}
