package pl.sda.patterns.adapter;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LadaTest {

    @Test
    void speedInMphShouldBe100() {
        MovableImperialInterface lada = new Lada();

        assertThat(lada.getSpeed()).isEqualTo(100);
    }

    @Test
    void speedInKmhShouldBe160() {
        MovableContinental lada = new MovableContinental(new Lada());

        assertThat(lada.getSpeed()).isEqualTo(160);
    }

}