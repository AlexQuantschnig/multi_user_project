package at.fhj.msd;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SimpleDrinkTest {

    @Test
    public void testSimpleDrinkProperties() {
        String drinkName = "Mojito";
        String liquidName = "Rum";
        double liquidVolume = 0.05;
        double liquidAlcoholPercent = 40.0;

        Liquid liquid = new Liquid(liquidName, liquidVolume, liquidAlcoholPercent);

        SimpleDrink simpleDrink = new SimpleDrink(drinkName, liquid);
        SimpleDrink simpleDrink1 = new SimpleDrink("cola", new Liquid("cola", 0.5, 0.0));

        Assertions.assertEquals(drinkName, simpleDrink.getName());
        simpleDrink.setName("Cola");
        Assertions.assertEquals("Cola", simpleDrink.getName());
        Assertions.assertEquals(liquidVolume, simpleDrink.getVolume(), 0.001);
        Assertions.assertEquals(liquidAlcoholPercent, simpleDrink.getAlcoholPercent(), 0.001);
        Assertions.assertTrue(simpleDrink.isAlcoholic());
        Assertions.assertFalse(simpleDrink1.isAlcoholic());
    }
}
