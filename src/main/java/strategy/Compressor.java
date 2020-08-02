package strategy;

public class Compressor {
    private final CompressorStrategy compressorStrategy;

    public Compressor(CompressorStrategy compressorStrategy) {
        this.compressorStrategy = compressorStrategy;
    }

    public String compress(){
        return compressorStrategy.compress();
    }
}
