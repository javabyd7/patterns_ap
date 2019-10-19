package pl.sda.patterns.decorator;

public class CoffeeWithCream implements CoffeeInterface {

    private CoffeeInterface coffeeInterface;

    public CoffeeWithCream(CoffeeInterface coffeeInterface) {
        this.coffeeInterface = coffeeInterface;
    }

    public int price() {
        return this.coffeeInterface.price() + 5;
    }

    public String name() {
        return this.coffeeInterface.name() + " with cream";
    }
}
