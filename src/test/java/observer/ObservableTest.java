package observer;

import behavioral.observer.withImpl.Observable;
import behavioral.observer.withImpl.ObserverImpl;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

class ObservableTest {
    @Test
    void observerShouldBeNotify() {
        Observable observable = new Observable();
        ObserverImpl observer = mock(ObserverImpl.class);
        observable.addObserver(observer);

        observable.notifyObservers("NOTIFY");

        verify(observer, times(1)).observe("NOTIFY");
    }
}