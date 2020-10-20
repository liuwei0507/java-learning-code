package com.shardingsphere.service;

import java.sql.SQLException;

public interface HealthLevelService {

    void processLevels() throws SQLException;
}
