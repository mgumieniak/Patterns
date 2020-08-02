package observer;

public class ObserverImpl implements Observer {
    @Override
    public void observe(String subject) {
        System.out.println("OBS: " + subject);
    }
}
