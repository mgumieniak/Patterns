package structural.proxy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProxyTest {

    @Test
    void testProxy() {
        Subject subject = new Proxy();
        System.out.println(subject.operation());
    }
}