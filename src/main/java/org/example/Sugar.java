package org.example;

public class Sugar extends AddOnDecorators {

    public final CoffeeShop coffeeShop;
    public Sugar(final CoffeeShop coffeeShop) {
        this.coffeeShop = coffeeShop;
    }

    @Override
    public Integer setPrice() {
        return this.coffeeShop.setPrice() + 1;
    }
}
