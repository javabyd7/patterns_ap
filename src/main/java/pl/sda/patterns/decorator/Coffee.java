package pl.sda.patterns.decorator;

public class Coffee implements CoffeeInterface {

    public int price() {
        return 5;
    }

    public String name() {
        return "coffee";
    }
}