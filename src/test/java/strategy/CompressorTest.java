package strategy;

import behavioral.strategy.Compressor;
import behavioral.strategy.SevenZipCompressor;
import org.junit.jupiter.api.Test;

class CompressorTest {

    @Test
    void compress() {
        Compressor compressor = new Compressor(new SevenZipCompressor());
        System.out.println(compressor.compress());
    }
}