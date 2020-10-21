package com.shardingsphere.sharding.repository;

import com.shardingsphere.sharding.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserRepository extends BaseRepository<User, Long> {
}
