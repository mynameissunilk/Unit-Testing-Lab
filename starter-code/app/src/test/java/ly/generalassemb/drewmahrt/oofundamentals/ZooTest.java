package ly.generalassemb.drewmahrt.oofundamentals;

/**
 * Created by sunil on 7/13/16.
 */
import org.junit.Test;

import static org.junit.Assert.*;

public class ZooTest {



        @Test
        public void testZoo() throws Exception{
            Zoo.getInstance().addAnimal(new Lion(true));
            // 4 legs, 50 topspeed, not endangered, named Lion, is Alpha

            Zoo.getInstance().addAnimal(new Snake(true));
            // no legs, 5 topspeed, not endangered, named Sname, is poisonous

            assertEquals(new Lion(true), Zoo.getInstance().getAnimals().get(0));

            assertEquals(new Snake(true), Zoo.getInstance().getAnimals().get(1));
        }



}
