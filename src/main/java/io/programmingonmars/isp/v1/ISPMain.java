package io.programmingonmars.isp.v1;

public class ISPMain {
    public static void main(String[] args) {
        FeeCalculator feeCalculator = new FeeCalculator();

        Vehicle car = new Car();
        System.out.println(feeCalculator.calculateFee(10, car));

        Vehicle foot = new Foot();
        System.out.println(feeCalculator.calculateFee(5, foot));

    }
}
