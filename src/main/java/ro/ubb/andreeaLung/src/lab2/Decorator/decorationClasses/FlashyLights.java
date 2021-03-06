package lab2.Decorator.decorationClasses;

import lab2.Proxy.CarPriceable;

public class FlashyLights extends CarDecoration {

    public FlashyLights(CarPriceable carPriceable) {
        super(carPriceable);
    }

    @Override
    public Long getPrice() {
        return super.getPrice() + 100L;
    }

    @Override
    public String toString() {
        return super.toString() + " decorated with FlashyLights";
    }
}
