package ly.generalassemb.drewmahrt.oofundamentals;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Created by sunil on 7/13/16.
 */
public class SnakeTest {
    @Test
    public void testSnakeNoise()throws Exception{
        Snake fat_Bob = new Snake(true);
        String expected = "Hiss";
        assertEquals(expected, fat_Bob.makeNoise());
        // actual: "Hiss!!!"
    }

    @Test
    public void testSnakeSpeed() throws Exception{
        Snake tim = new Snake(false);

        assertEquals(5, tim.getTopSpeed());
        //seems to work...

        /** I think I'm going to go home to get osme sleep**/
    }

}
