package com.shardingsphere.sharding.repository;

import com.shardingsphere.sharding.entity.EncryptUser;
import com.shardingsphere.sharding.repository.BaseRepository;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EncryptUserRepository extends BaseRepository<EncryptUser, Long> {

}
