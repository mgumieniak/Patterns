package structural.decorator;

public class PairingDecorator implements Pairing {

    Pairing pairing;

    public PairingDecorator(Pairing pairing) {
        this.pairing = pairing;
    }

    @Override
    public void pair(String tagId, String resourceId) {
        pairing.pair(tagId, resourceId);
    }
}
