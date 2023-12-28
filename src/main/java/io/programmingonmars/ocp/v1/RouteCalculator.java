package io.programmingonmars.ocp.v1;

public record RouteCalculator(String vehicleType, Double distanceInKm){
    public Double calculate(){
        if (vehicleType.equals("Car")) {
            var minFee = 6.0;
            return 3.0 * distanceInKm + minFee;

        } else if (vehicleType.equals("Bike")) {
            var minFee = 3.0;
            return 1.0 * distanceInKm + minFee;

        } else if (vehicleType.equals("Motorcycle")) {
            var minFee = 4.0;
            return 3.0 * distanceInKm + minFee;
        }

        throw new IllegalArgumentException("Invalid vehicle type");
    }
}
