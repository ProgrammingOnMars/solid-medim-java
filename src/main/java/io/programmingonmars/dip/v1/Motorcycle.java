package io.programmingonmars.dip.v1;

public record Motorcycle(String brand, String model, String plate) {
    double calculateDistance(double distanceInKm) {
        double fee = distanceInKm * multiplier();
        if (fee < minFee()) {
            return minFee();
        }

        if (fee > maxFee()) {
            return maxFee();
        }

        return fee;

    }
    double multiplier() {
        return 2.0;
    }

    double minFee() {
        return 5.0;
    }

    double maxFee() {
        return 50.0;
    }
}
