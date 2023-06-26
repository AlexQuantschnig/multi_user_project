package at.fhj.msd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;


public class CocktailTest {

    Cocktail cocktail;
    ArrayList<Liquid> sexOnTheBeach = new ArrayList<>();
    ArrayList<Liquid> margarita = new ArrayList<>();
    ArrayList<Liquid> pinaColada = new ArrayList<>();
    ArrayList<Liquid> orangeFizz = new ArrayList<>();


    @BeforeEach
    public void setUp() {
        sexOnTheBeach.add(new Liquid("vodka", 0.04, 40));
        sexOnTheBeach.add(new Liquid("peach liquor", 0.02, 20));
        sexOnTheBeach.add(new Liquid("cranberry juice", 0.04, 0));
        sexOnTheBeach.add(new Liquid("lemon juice", 0.01, 0));
        sexOnTheBeach.add(new Liquid("orange juice", 0.25, 0));

        margarita.add(new Liquid("lime juice", 0.02, 0));
        margarita.add(new Liquid("orange liquor", 0.01, 15));
        margarita.add(new Liquid("tequila", 0.05, 38));

        pinaColada.add(new Liquid("lemon juice", 0.01, 0));
        pinaColada.add(new Liquid("cream of coconut", 0.04, 0));
        pinaColada.add(new Liquid("cream", 0.02, 0));
        pinaColada.add(new Liquid("rum", 0.06, 38));
        pinaColada.add(new Liquid("pineapple juice", 0.08, 0));

        orangeFizz.add(new Liquid("lemon juice", 0.02, 0));
        orangeFizz.add(new Liquid("blackcurrant juice", 0.03, 0));
        orangeFizz.add(new Liquid("orange juice", 0.08, 0));
        orangeFizz.add(new Liquid("sparkling water", 0.1, 0));
    }

    @Test
    public void testGetVolumeSexOnTheBeach() {

        cocktail = new Cocktail("Sex on the Beach", sexOnTheBeach);

        double result = cocktail.getVolume();
        assertEquals(0.36, result, 0.001);
    }
    @Test
    public void testGetVolumeMargarita() {

        cocktail = new Cocktail("Margarita", margarita);

        double result = cocktail.getVolume();
        assertEquals(0.08, result, 0.001);
    }
    @Test
    public void testGetVolumePinaColada() {

        cocktail = new Cocktail("Pina Colada", pinaColada);

        double result = cocktail.getVolume();
        assertEquals(0.21, result, 0.001);
    }
    @Test
    public void testGetVolumeOrangeFizz() {

        cocktail = new Cocktail("Orange Fizz", orangeFizz);

        double result = cocktail.getVolume();
        assertEquals(0.23, result, 0.001);
    }

    @Test
    public void testGetAlcoholPercentSexOnTheBeach() {

        cocktail = new Cocktail("Sex on the Beach", sexOnTheBeach);

        double result = Math.round(cocktail.getAlcoholPercent()*100)/100.0;
        assertEquals(5.56, result, 0.001);
    }
    @Test
    public void testGetAlcoholPercentMargarita() {

        cocktail = new Cocktail("Margarita", margarita);

        double result = Math.round(cocktail.getAlcoholPercent()*100)/100.0;
        assertEquals(25.63, result, 0.001);
    }
    @Test
    public void testGetAlcoholPercentPinaColada() {

        cocktail = new Cocktail("Pina Colada", pinaColada);

        double result = Math.round(cocktail.getAlcoholPercent()*100)/100.0;
        assertEquals(10.86, result, 0.001);
    }
    @Test
    public void testGetAlcoholPercentOrangeFizz() {

        cocktail = new Cocktail("Orange Fizz", orangeFizz);

        double result = Math.round(cocktail.getAlcoholPercent()*100)/100.0;
        assertEquals(0, result, 0.001);
    }

    @Test
    public void testIsAlcoholicSexOnTheBeach() {

        cocktail = new Cocktail("Sex on the Beach", sexOnTheBeach);
        assertTrue(cocktail.isAlcoholic());
    }
    @Test
    public void testIsAlcoholicMargarita() {

        cocktail = new Cocktail("Margarita", margarita);

        assertTrue(cocktail.isAlcoholic());
    }
    @Test
    public void testIsAlcoholicPinaColada() {

        cocktail = new Cocktail("Pina Colada", pinaColada);

        assertTrue(cocktail.isAlcoholic());
    }
    @Test
    public void testIsAlcoholicOrangeFizz() {

        cocktail = new Cocktail("Orange Fizz", orangeFizz);

        assertFalse(cocktail.isAlcoholic());
    }
}
