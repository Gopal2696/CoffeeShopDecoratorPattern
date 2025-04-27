package org.example;

public class Milk extends AddOnDecorators {

    public final CoffeeShop coffeeShop;
    public Milk(final CoffeeShop coffeeShop) {
        this.coffeeShop = coffeeShop;
    }

    @Override
    public Integer setPrice() {
        return this.coffeeShop.setPrice() + 1;
    }
}
