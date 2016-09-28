package de.dhbw;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by GAUDICHT on 28.09.2016.
 */
public class RandomGeneratorTest {
    @Test
    public void testGenerator() throws Exception {
        int anzahlZahlen=(int) Math.random()*10;
        assertEquals(anzahlZahlen, RandomGenerator.randomZahlen(anzahlZahlen).length);

    }


}
