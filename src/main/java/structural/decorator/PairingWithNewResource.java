package structural.decorator;

public class PairingWithNewResource extends PairingDecorator {
    public PairingWithNewResource(Pairing pairing) {
        super(pairing);
    }

    @Override
    public void pair(String tagId, String resourceId) {
        super.pair(tagId, resourceId);
        System.out.println("Addition logic!");
    }
}
