package io.programmingonmars.srp.v2;

import java.sql.*;

public class DriverRepository {
    private final Connection connection;
    private static DriverRepository INSTANCE;

    private DriverRepository(Connection connection) {
        this.connection = connection;
    }

    public static DriverRepository getInstance(Connection connection) {
        if (INSTANCE == null) {
            INSTANCE = new DriverRepository(connection);
        }
        return INSTANCE;
    }
    public void save(Driver driver) {
        try {
            PreparedStatement statement = connection.prepareStatement("INSERT INTO drivers (id, name, work_region, vehicle_type) VALUES (?, ?, ?, ?)");
            statement.setObject(1, driver.id());
            statement.setString(2, driver.name());
            statement.setString(3, driver.workRegion());
            statement.setString(4, driver.vehicleType());
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}

