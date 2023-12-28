package io.programmingonmars.ocp.v2.calculators;

import io.programmingonmars.ocp.v2.VehicleCalculator;

public record BikeRouteCalculator() implements VehicleCalculator {
    @Override
    public double calculate(double distanceInKm) {
        var minFee = 3.0;
        return 2.0 * distanceInKm + minFee;
    }
}
