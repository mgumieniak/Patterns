package behavioral.strategy;

public class ZipCompressor implements CompressorStrategy {
    @Override
    public String compress() {
        return "ZipCompressor";
    }
}
