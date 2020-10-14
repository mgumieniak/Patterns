package behavioral.observer.withImpl;

import java.util.ArrayList;
import java.util.List;

public class Observable {
    private final List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer){
        observers.add(observer);
    }

    public void notifyObservers(String subject){
        observers.forEach(observer -> observer.observe(subject));
    }
}
