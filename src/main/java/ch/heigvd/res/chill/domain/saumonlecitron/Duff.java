package ch.heigvd.res.chill.domain.saumonlecitron;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Duff implements IProduct {

    public final static String NAME = "Duff";
    public final static BigDecimal PRICE = new BigDecimal(6.9);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
