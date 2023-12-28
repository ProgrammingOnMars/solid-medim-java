package io.programmingonmars.Lsp.v2;

public class Vehicle {
    double calculateDistance(double distanceInKm){
        double value = distanceInKm * 1.5;

        if(value < 2){
            return minFee();
        }

        if (value + minFee() > maxFee()){
            return maxFee();
        }

        return value + minFee();
    }
    double minFee(){
        return 5;
    }
    double maxFee(){
        return 100;
    }
}
