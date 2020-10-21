package com.shardingsphere.sharding.service;

import java.sql.SQLException;

public interface HealthLevelService {

    void processLevels() throws SQLException;
}
