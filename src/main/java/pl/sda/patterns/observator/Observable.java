package pl.sda.patterns.observator;

public interface Observable {

    void attach(Observer observer);

    void detach(Observer observer);

    void notifyObservers();
}
