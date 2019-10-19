package pl.sda.patterns.adapter;

public class MovableContinental implements MovableImperialInterface {
    private MovableImperialInterface lada;

    public MovableContinental(Lada lada) {
        this.lada = lada;
    }


    public Double getSpeed() {
        return convertToContinental(lada.getSpeed());
    }

    private Double convertToContinental(Double mph) {
        return mph * 1.6;
    }
}