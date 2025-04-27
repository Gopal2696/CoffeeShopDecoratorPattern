package org.example;

public class Caramel extends AddOnDecorators {

    public final CoffeeShop baseCoffee;

    public Caramel(final CoffeeShop coffeeShop) {
        this.baseCoffee = coffeeShop;
    }

    @Override
    public Integer setPrice() {
        return this.baseCoffee.setPrice() + 1;
    }
}
