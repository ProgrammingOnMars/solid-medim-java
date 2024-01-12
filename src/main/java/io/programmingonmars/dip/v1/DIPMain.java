package io.programmingonmars.dip.v1;

import java.util.UUID;

public class DIPMain {

    public static void main(String[] args) {
        Motorcycle motorcycle = new Motorcycle("Yamaha", "XPTO", "ABC-1234");
        Driver driver = new Driver(UUID.randomUUID(), "andre", motorcycle);

        System.out.println(driver.motorcycle().calculateDistance(10.0));
    }
}
