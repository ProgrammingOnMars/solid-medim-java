package io.programmingonmars.isp.v1;

public class Foot implements Vehicle {
    @Override
    public double calculateDistance(double distanceInKm) {
        return multiplier() * distanceInKm;
    }

    @Override
    public double minFee() {
        return 2.0;
    }

    @Override
    public double maxFee() {
        return 10;
    }

    @Override
    public double multiplier() {
        return 0;
    }
}
