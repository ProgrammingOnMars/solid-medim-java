package io.programmingonmars.isp.v1;

public class Car implements Vehicle{
    @Override
    public double calculateDistance(double distanceInKm) {
        return multiplier() * distanceInKm;
    }

    @Override
    public double minFee() {
        return 6.80;
    }

    @Override
    public double maxFee() {
        return 100;
    }

    @Override
    public double multiplier() {
        return 2.5;
    }
}
