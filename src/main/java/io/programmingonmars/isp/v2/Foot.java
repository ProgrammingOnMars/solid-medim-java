package io.programmingonmars.isp.v2;

public class Foot implements Modal {
    @Override
    public double calculateDistance(double distanceInKm) {
        return distanceInKm;
    }

    @Override
    public double minFee() {

        return 2.5;
    }

    @Override
    public double maxFee() {
        return 15.5;
    }
}
