package io.programmingonmars.Lsp.v1;

public record FeeCalculator(Vehicle vehicle) {
    public Double calculateFee(double distanceInKm) {
        return vehicle.calculateDistance(distanceInKm);
    }
}
