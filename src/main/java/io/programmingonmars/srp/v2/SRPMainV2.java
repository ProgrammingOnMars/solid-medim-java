package io.programmingonmars.srp.v2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SRPMainV2 {
    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/solid", "solid", "solid");

        DriverTable
                .getInstance(connection)
                .create();

        Driver andre = new Driver("Andre Doe", "London", "Car");
        DriverRepository
                .getInstance(connection)
                .save(andre);

        Driver joe = new Driver("Joe Doe", "Lisbon", "Bike");
        DriverRepository.getInstance(connection).save(joe);
    }
}
