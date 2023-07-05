package at.fhj.msd;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class DrinkQueueTest {
    private DrinkQueue drinkQueue;

    @BeforeEach
    public void setup() {
        drinkQueue = new DrinkQueue();
    }

    @Test
    public void testOffer() {
        SimpleDrink simpleDrink = new SimpleDrink("Vodka", new Liquid("Vodka", 0.02, 40));
        Cocktail cocktail = new Cocktail("Mojito", new ArrayList<>());

        Assertions.assertTrue(drinkQueue.offer(simpleDrink));
        Assertions.assertTrue(drinkQueue.offer(cocktail));
        Assertions.assertFalse(drinkQueue.offer(simpleDrink));
    }

    @Test
    public void testPoll() {
        SimpleDrink simpleDrink = new SimpleDrink("Vodka", new Liquid("Vodka", 0.02, 40));
        Cocktail cocktail = new Cocktail("Mojito", new ArrayList<>());

        drinkQueue.offer(simpleDrink);
        drinkQueue.offer(cocktail);

        Assertions.assertEquals(simpleDrink, drinkQueue.poll());
        Assertions.assertEquals(cocktail, drinkQueue.poll());
        Assertions.assertNull(drinkQueue.poll());
    }

    @Test
    public void testRemove() {
        SimpleDrink simpleDrink = new SimpleDrink("Vodka", new Liquid("Vodka", 0.02, 40));
        Cocktail cocktail = new Cocktail("Mojito", new ArrayList<>());

        drinkQueue.offer(simpleDrink);
        drinkQueue.offer(cocktail);

        Assertions.assertEquals(simpleDrink, drinkQueue.remove());
        Assertions.assertEquals(cocktail, drinkQueue.remove());
        assertThrows(NoSuchElementException.class, () -> drinkQueue.remove());
    }

    @Test
    public void testPeek() {
        SimpleDrink simpleDrink = new SimpleDrink("Vodka", new Liquid("Vodka", 0.02, 40));
        Cocktail cocktail = new Cocktail("Mojito", new ArrayList<>());

        drinkQueue.offer(simpleDrink);
        drinkQueue.offer(cocktail);

        Assertions.assertEquals(simpleDrink, drinkQueue.peek());
        drinkQueue.poll();
        Assertions.assertEquals(cocktail, drinkQueue.peek());
        drinkQueue.poll();
        Assertions.assertNull(drinkQueue.peek());
    }

    @Test
    public void testElement() {
        SimpleDrink simpleDrink = new SimpleDrink("Vodka", new Liquid("Vodka", 0.02, 40));
        Cocktail cocktail = new Cocktail("Mojito", new ArrayList<>());

        drinkQueue.offer(simpleDrink);
        drinkQueue.offer(cocktail);

        Assertions.assertEquals(simpleDrink, drinkQueue.element());
        drinkQueue.poll();
        Assertions.assertEquals(cocktail, drinkQueue.element());
        drinkQueue.poll();
        assertThrows(NoSuchElementException.class, () -> drinkQueue.element());
    }

    @Test
    public void testGetDrinks() {
        SimpleDrink simpleDrink = new SimpleDrink("Vodka", new Liquid("Vodka", 0.02, 40));
        Cocktail cocktail = new Cocktail("Mojito", new ArrayList<>());

        drinkQueue.offer(simpleDrink);
        drinkQueue.offer(cocktail);

        ArrayList<Drink> expected = new ArrayList<>();
        expected.add(simpleDrink);
        expected.add(cocktail);

        Assertions.assertEquals(expected, drinkQueue.getDrinks());
    }
}
