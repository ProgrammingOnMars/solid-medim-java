package io.programmingonmars.srp.v1;

import java.sql.*;
import java.util.UUID;

public record Driver(UUID id, String name, String workRegion, String vehicleType) {
    public Driver(String name, String workRegion, String vehicleType) {
        this(UUID.randomUUID(), name, workRegion, vehicleType);
    }

    public static void createTable() {
        try (Connection connection = getConnection()) {
            Statement statement = connection.createStatement();
            statement.executeUpdate("CREATE TABLE IF NOT EXISTS drivers (id UUID PRIMARY KEY, name VARCHAR(255), work_region VARCHAR(255), vehicle_type VARCHAR(255))");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:postgresql://localhost:5432/solid", "solid", "solid");
    }

    public void save() {
        try (Connection connection = getConnection()) {
            PreparedStatement statement = connection.prepareStatement("INSERT INTO drivers (id, name, work_region, vehicle_type) VALUES (?, ?, ?, ?)");
            statement.setObject(1, id);
            statement.setString(2, name);
            statement.setString(3, workRegion);
            statement.setString(4, vehicleType);
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
