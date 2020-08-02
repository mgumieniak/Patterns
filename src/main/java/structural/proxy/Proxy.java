package structural.proxy;

public class Proxy implements Subject {

    private Subject subject;

    @Override
    public String operation() {
        System.out.println("PROXY");

        if(subject == null){
            subject = new RealSubject();
        }
        System.out.println("Call operation on original object");
        return subject.operation();
    }
}
