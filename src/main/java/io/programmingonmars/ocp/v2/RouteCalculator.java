package io.programmingonmars.ocp.v2;

public record RouteCalculator(
        VehicleCalculator vehicleCalculator,
        Double distanceInKm){
    public Double calculate(){
        return vehicleCalculator.calculate(distanceInKm);
    }
}
