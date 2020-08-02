package strategy;

import com.sun.tools.javac.util.List;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompressorTest {

    @Test
    void compress() {
        Compressor compressor = new Compressor(new SevenZipCompressor());
        System.out.println(compressor.compress());
    }
}