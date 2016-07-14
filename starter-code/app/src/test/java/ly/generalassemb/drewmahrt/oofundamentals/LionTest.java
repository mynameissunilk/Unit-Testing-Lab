package ly.generalassemb.drewmahrt.oofundamentals;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by sunil on 7/13/16.
 */
public class LionTest {

    @Test
    public void testLionNoise() throws Exception{
        Lion simba = new Lion(true);
        String expected = "Roar";
        assertEquals(expected,simba.makeNoise());
        // actual: "Roar!!!"
    }
    @Test // numlegs, topspeed, isendangered, name, isAlpha
    public void testLionSpeed() throws Exception {
        Lion mufasa = new Lion(true);
        mufasa.setTopSpeed(50);
        assertEquals(50, mufasa.getTopSpeed());
        // works...
    }
}
