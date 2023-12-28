package io.programmingonmars.ocp.v2.calculators;

import io.programmingonmars.ocp.v2.VehicleCalculator;

public record CarRouteCalculator() implements VehicleCalculator {
    @Override
    public double calculate(double distanceInKm) {
        var minFee = 6.0;
        return 3.0 * distanceInKm + minFee;
    }
}
