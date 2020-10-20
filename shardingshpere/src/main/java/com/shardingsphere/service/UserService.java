package com.shardingsphere.service;

import com.shardingsphere.entity.User;

import java.sql.SQLException;
import java.util.List;


public interface UserService {

	void processUsers() throws SQLException;

	List<User> getUsers() throws SQLException;

}
