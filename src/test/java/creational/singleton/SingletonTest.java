package creational.singleton;

import org.junit.jupiter.api.Test;

class SingletonTest {

    @Test
    public void testSingleton(){
        Singleton firstObject = Singleton.PAWEL;
        Singleton secondObject = Singleton.MACIEJ;
    }

}