package io.programmingonmars.dip.v2;

public record Motorcycle(String brand, String model, String plate) implements Vehicle {
    @Override
    public double calculateDistance(double distanceInKm) {
        double fee = distanceInKm * multiplier();
        if (fee < minFee()) {
            return minFee();
        }

        if (fee > maxFee()) {
            return maxFee();
        }

        return fee;

    }
    @Override
    public double multiplier() {
        return 2.0;
    }

    @Override
    public double minFee() {
        return 5.0;
    }

    @Override
    public double maxFee() {
        return 50.0;
    }
}
