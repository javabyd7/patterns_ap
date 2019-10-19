package pl.sda.patterns.observator;

import java.util.HashSet;
import java.util.Set;

public class Blog implements Observable {

    private Set<Observer> users;
    private String newestArticle;

    public Blog() {
        users = new HashSet<Observer>();
    }

    @Override
    public void attach(Observer observer) {
        users.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        users.remove(observer);
    }

    @Override
    public void notifyObservers() {
        users.forEach(Observer::update);
    }

    public String getNewestArticle() {
        return newestArticle;
    }

    public void setNewestArticle(String newestArticle) {
        this.newestArticle = newestArticle;
        notifyObservers();
    }
}
