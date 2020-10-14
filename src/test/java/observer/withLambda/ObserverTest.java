package observer.withLambda;

import behavioral.observer.withLambda.Subject;
import org.junit.jupiter.api.Test;

class ObserverTest {
    @Test
    void testObserver() {
        Subject subject = new Subject();
        subject.add(msg->System.out.println("1" + msg));
        subject.add(msg->System.out.println("2" + msg));
        subject.notifyObservers(" Test");
    }
}