package io.programmingonmars.isp.v2;

public class ISPMain {
    public static void main(String[] args) {
        FeeCalculator feeCalculator = new FeeCalculator();

        Modal car = new Car();
        System.out.println(feeCalculator.calculateFee(10, car));

        Modal foot = new Foot();
        System.out.println(feeCalculator.calculateFee(5, foot));

    }
}
