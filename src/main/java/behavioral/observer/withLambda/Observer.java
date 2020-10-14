package behavioral.observer.withLambda;

@FunctionalInterface
public interface Observer {
    void notify(String msg);
}
