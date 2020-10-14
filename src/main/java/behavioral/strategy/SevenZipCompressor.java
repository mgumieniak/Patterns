package behavioral.strategy;

public class SevenZipCompressor implements CompressorStrategy{
    @Override
    public String compress() {
        return "SevenZipCompressor";
    }
}
