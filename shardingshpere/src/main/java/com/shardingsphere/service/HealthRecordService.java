package com.shardingsphere.service;

import java.sql.SQLException;

public interface HealthRecordService {

	void processHealthRecords() throws SQLException;
}
