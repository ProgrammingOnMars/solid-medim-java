package io.programmingonmars.dip.v2;

public record Car(String brand, String model, String plate) implements Vehicle{
    @Override
    public double calculateDistance(double distanceInKm) {
        return 0;
    }

    @Override
    public double multiplier() {
        return 0;
    }

    @Override
    public double minFee() {
        return 0;
    }

    @Override
    public double maxFee() {
        return 0;
    }
}
