package at.fhj.msd;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Test case for the SimpleDrink class
 */
public class SimpleDrinkTest {

    /**
     * Test case to verify the properties of the SimpleDrink class
     */
    @Test
    public void testSimpleDrinkProperties() {
        String drinkName = "Mojito";
        String liquidName = "Rum";
        double liquidVolume = 0.05;
        double liquidAlcoholPercent = 40.0;

        Liquid liquid = new Liquid(liquidName, liquidVolume, liquidAlcoholPercent);

        SimpleDrink simpleDrink = new SimpleDrink(drinkName, liquid);

        Assertions.assertEquals(drinkName, simpleDrink.getName());
        Assertions.assertEquals(liquidVolume, simpleDrink.getVolume(), 0.001);
        Assertions.assertEquals(liquidAlcoholPercent, simpleDrink.getAlcoholPercent(), 0.001);
        Assertions.assertTrue(simpleDrink.isAlcoholic());
    }
}
