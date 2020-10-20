package com.shardingsphere.repository;

import com.shardingsphere.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
public interface UserRepository extends BaseRepository<User, Long> {
}
