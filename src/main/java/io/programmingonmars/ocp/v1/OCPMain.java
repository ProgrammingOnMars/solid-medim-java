package io.programmingonmars.ocp.v1;

public class OCPMain {
    public static void main(String[] args) {
        RouteCalculator routeCalculator = new RouteCalculator("Car", 10.0);
        System.out.println(routeCalculator.calculate());

        routeCalculator = new RouteCalculator("Bike", 10.0);
        System.out.println(routeCalculator.calculate());

        routeCalculator = new RouteCalculator("Motorcycle", 10.0);
        System.out.println(routeCalculator.calculate());
    }
}
