package com.shardingsphere.sharding.service;

import com.shardingsphere.sharding.entity.User;

import java.sql.SQLException;
import java.util.List;


public interface UserService {

	void processUsers() throws SQLException;

	List<User> getUsers() throws SQLException;

}
