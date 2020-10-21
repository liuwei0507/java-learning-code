package com.shardingsphere.sharding.hint;

import org.apache.shardingsphere.shardingjdbc.api.yaml.YamlShardingDataSourceFactory;

import javax.sql.DataSource;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;

public class DataSourceHelper {
    static DataSource getDataSourceForShardingDatabases() throws IOException, SQLException {
        return YamlShardingDataSourceFactory.createDataSource(getFile("/hint/hint-databases.yaml"));
    }

    static DataSource getDataSourceForShardingDatabasesAndTables() throws IOException, SQLException {
        return YamlShardingDataSourceFactory.createDataSource(getFile("/hint/hint-databases-tables.yaml"));
    }

    static DataSource getDataSourceForMaster() throws IOException, SQLException {
        return YamlShardingDataSourceFactory.createDataSource(getFile("/hint/hint-master-only.yaml"));
    }

    private static File getFile(final String configFile) {
        return new File(Thread.currentThread().getClass().getResource(configFile).getFile());
    }
}
