package structural.proxy;

public class RealSubject implements Subject {
    @Override
    public String operation() {
        return "Real object";
    }
}
