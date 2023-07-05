package at.fhj.msd;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class DrinkQueueTest {
    /**
     * Test cases for the DrinkQueue class
     */
    private DrinkQueue drinkQueue;

    /**
     * Set up the test data befor each test case
     */
    @BeforeEach
    public void setup() {
        drinkQueue = new DrinkQueue();
    }

    /**
     * Tests if the drinks are added to the queue
     */
    @Test
    public void testOffer() {
        SimpleDrink simpleDrink = new SimpleDrink("Vodka", new Liquid("Vodka", 0.02, 40));
        Cocktail cocktail = new Cocktail("Mojito", new ArrayList<>());

        Assertions.assertTrue(drinkQueue.offer(simpleDrink));
        Assertions.assertTrue(drinkQueue.offer(cocktail));
        Assertions.assertFalse(drinkQueue.offer(simpleDrink));
    }
    /**
     * Test if the drinks are poll right and have been deleted after polling
     */
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
    /**
     * Tests if the drinks will be right removed from the queue
     */
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
    /**
     * Tests if the drinks are right peeked , without deleting it
     */
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
    /**
     * Tests if the drinks are right peeked , without deleting it
     */
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
    /**
     * Tests if the queue contains all elements
     */
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
