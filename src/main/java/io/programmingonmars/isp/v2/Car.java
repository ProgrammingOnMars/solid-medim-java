package io.programmingonmars.isp.v2;

public class Car implements Modal, Multiplicable{
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
