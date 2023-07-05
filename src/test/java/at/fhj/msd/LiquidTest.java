package at.fhj.msd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Test cases for the Liquid class
 */
public class LiquidTest {
    /**
     * Test case to verify the properties of the Liquid class
     */
    @Test
    public void testLiquidProperties() {
        String name = "Vodka";
        double volume = 0.7;
        double alcoholPercent = 40.0;

        Liquid liquid = new Liquid(name, volume, alcoholPercent);

        Assertions.assertEquals(name, liquid.getName());
        Assertions.assertEquals(volume, liquid.getVolume(), 0.001);
        Assertions.assertEquals(alcoholPercent, liquid.getAlcoholPercent(), 0.001);

        String newName = "Whiskey";
        double newVolume = 1.0;
        double newAlcoholPercent = 45.0;

        liquid.setName(newName);
        liquid.setVolume(newVolume);
        liquid.setAlcoholPercent(newAlcoholPercent);

        Assertions.assertEquals(newName, liquid.getName());
        Assertions.assertEquals(newVolume, liquid.getVolume(), 0.001);
        Assertions.assertEquals(newAlcoholPercent, liquid.getAlcoholPercent(), 0.001);
    }
}
