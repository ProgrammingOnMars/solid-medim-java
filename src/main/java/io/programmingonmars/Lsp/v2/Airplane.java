package io.programmingonmars.Lsp.v2;


public class Airplane extends Vehicle {
    @Override
    double minFee() {
        return 1000;
    }

    @Override
    double maxFee() {
        return 200000;
    }
}
