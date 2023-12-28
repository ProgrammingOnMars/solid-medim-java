package io.programmingonmars.srp.v1;

public class SRPMain {
    public static void main(String[] args) {
        Driver.createTable();
        Driver driver = new Driver("John Doe", "London", "Car");
        driver.save();
    }
}
