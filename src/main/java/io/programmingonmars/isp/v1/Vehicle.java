package io.programmingonmars.isp.v1;

public interface Vehicle {
    double calculateDistance(double distanceInKm);
    double minFee();
    double maxFee();
    double multiplier();
}
