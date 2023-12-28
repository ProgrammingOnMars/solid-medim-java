package io.programmingonmars.Lsp.v1;


public class Airplane {
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
        return 1000;
    }
    double maxFee(){
        return 200000;
    }
}
