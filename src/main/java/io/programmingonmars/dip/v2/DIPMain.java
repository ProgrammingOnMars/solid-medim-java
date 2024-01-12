package io.programmingonmars.dip.v2;

import java.util.UUID;

public class DIPMain {

    public static void main(String[] args) {
        Vehicle motorcycle = new Motorcycle("Yamaha", "XPTO", "ABC-1234");
        Driver driver = new Driver(UUID.randomUUID(), "andre", motorcycle);

        System.out.println(driver.vehicle().calculateDistance(10.0));

        Vehicle car = new Car("Honda", "XPTO", "XYZ-7890");
        Driver driver2 = new Driver(UUID.randomUUID(), "lucas", car);

        System.out.println(driver2.vehicle().calculateDistance(21.0));
    }
}
