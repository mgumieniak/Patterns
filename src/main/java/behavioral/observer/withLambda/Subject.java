package behavioral.observer.withLambda;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private final List<Observer> observers = new ArrayList<>();

    public void notifyObservers(String msg){
        observers.forEach(observer -> observer.notify(msg));
    }

    public void add(Observer observer){
        observers.add(observer);
    }
}
