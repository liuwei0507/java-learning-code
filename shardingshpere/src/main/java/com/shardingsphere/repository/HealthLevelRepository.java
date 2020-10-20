package com.shardingsphere.repository;

import com.shardingsphere.entity.HealthLevel;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
public interface HealthLevelRepository extends BaseRepository<HealthLevel, Long> {
}
