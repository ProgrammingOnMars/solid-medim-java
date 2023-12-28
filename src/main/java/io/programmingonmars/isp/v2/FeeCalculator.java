package io.programmingonmars.isp.v2;

public class FeeCalculator {
    public Double calculateFee(double distanceInKm, Modal modal) {
        double value = modal.calculateDistance(distanceInKm);

        if(value < modal.minFee()){
            return modal.minFee();
        }

        if (value + modal.minFee() > modal.maxFee()){
            return modal.maxFee();
        }

        return value + modal.minFee();
    }
}
