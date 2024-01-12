package io.programmingonmars.srp.v2;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DriverTable{
    private final Connection connection;
    private static DriverTable INSTANCE;

    private DriverTable(Connection connection) {
        this.connection = connection;
    }

    public static DriverTable getInstance(Connection connection) {
        if (INSTANCE == null) {
            INSTANCE = new DriverTable(connection);
        }
        return INSTANCE;
    }
    public void create() {
        try  {
            Statement statement = connection.createStatement();
            statement.executeUpdate("CREATE TABLE IF NOT EXISTS drivers (id UUID PRIMARY KEY, name VARCHAR(255), work_region VARCHAR(255), vehicle_type VARCHAR(255))");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
