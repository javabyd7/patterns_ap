package pl.sda.patterns.decorator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CoffeeTest {


    @Test
    void priceShouldBe5() {
        CoffeeInterface coffee = new Coffee();

        assertThat(coffee.price()).isEqualTo(5);
    }

    @Test
    void priceShouldBe10() {
        CoffeeWithCream coffee = new CoffeeWithCream(new Coffee());

        assertThat(coffee.price()).isEqualTo(10);
    }
}