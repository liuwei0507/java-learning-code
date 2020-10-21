package com.shardingsphere.sharding.service;

import java.sql.SQLException;

public interface HealthRecordService {

	void processHealthRecords() throws SQLException;
}
