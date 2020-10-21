package com.shardingsphere.hint;

import java.io.IOException;
import java.sql.SQLException;

public interface HintService {
    void processWithHintValueForShardingDatabases() throws SQLException, IOException;

    void processWithHintValueForShardingDatabasesAndTables() throws SQLException, IOException;

    void processWithHintValueMaster() throws SQLException, IOException;
}
