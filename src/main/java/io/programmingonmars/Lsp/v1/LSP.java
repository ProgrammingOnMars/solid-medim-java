package io.programmingonmars.Lsp.v1;

/** Liskov Substitution Principle  */
public class LSP {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        FeeCalculator vehicleFeeCalculator = new FeeCalculator(vehicle);
        System.out.println(vehicleFeeCalculator.calculateFee(10));

        Airplane airplane = new Airplane();
        //FeeCalculator airplaneFeeCalculator = new FeeCalculator(airplane);
        //System.out.println(airplaneFeeCalculator.calculateFee(10));
    }
}
