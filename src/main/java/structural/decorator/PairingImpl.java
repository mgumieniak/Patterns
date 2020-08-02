package structural.decorator;

public class PairingImpl implements Pairing {
    @Override
    public void pair(String tagId, String resourceId) {
        System.out.println("Pair logic");
    }
}
