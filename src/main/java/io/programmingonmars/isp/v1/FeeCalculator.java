package io.programmingonmars.isp.v1;

public class FeeCalculator {
    public Double calculateFee(double distanceInKm, Vehicle vehicle) {
        double value = vehicle.calculateDistance(distanceInKm);

        if(value < vehicle.minFee()){
            return vehicle.minFee();
        }

        if (value + vehicle.minFee() > vehicle.maxFee()){
            return vehicle.maxFee();
        }

        return value + vehicle.minFee();
    }
}
