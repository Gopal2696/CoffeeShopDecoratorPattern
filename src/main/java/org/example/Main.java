package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        final CoffeeShop espressoCoffee = new Milk(new Caramel(new EspressoCoffee()));
        System.out.println(espressoCoffee.setPrice());

        }
    }
