package structural.decorator;

import org.junit.jupiter.api.Test;

class PairingTest {
    @Test
    void decorator() {
//        Pairing pairing = new PairingImpl();

        Pairing pairing = new PairingWithNewResource(new PairingImpl());
        pairing.pair("1T","1R");
    }
}