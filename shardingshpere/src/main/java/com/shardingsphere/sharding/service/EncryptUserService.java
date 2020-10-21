package com.shardingsphere.sharding.service;

import com.shardingsphere.sharding.entity.EncryptUser;

import java.sql.SQLException;
import java.util.List;

public interface EncryptUserService {

	void processEncryptUsers() throws SQLException;

	List<EncryptUser> getEncryptUsers() throws SQLException;

}
