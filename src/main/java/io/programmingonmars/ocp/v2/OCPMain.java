package io.programmingonmars.ocp.v2;

import io.programmingonmars.ocp.v2.calculators.BikeRouteCalculator;
import io.programmingonmars.ocp.v2.calculators.CarRouteCalculator;
import io.programmingonmars.ocp.v2.calculators.MotorcycleRouteCalculator;

public class OCPMain {
    public static void main(String[] args) {
        RouteCalculator bikeRouteCalculator = new RouteCalculator(new BikeRouteCalculator(), 10.0);
        System.out.println("Bike route: " + bikeRouteCalculator.calculate());

        RouteCalculator carRouteCalculator = new RouteCalculator(new CarRouteCalculator(), 10.0);
        System.out.println("Car route: " + carRouteCalculator.calculate());

        RouteCalculator motorcycleRouteCalculator = new RouteCalculator(new MotorcycleRouteCalculator(), 10.0);
        System.out.println("Motorcycle route: " + motorcycleRouteCalculator.calculate());

    }
}
