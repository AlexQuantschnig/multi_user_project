package at.fhj.msd;

import java.util.ArrayList;
import java.util.NoSuchElementException;

/**
 * Data structure: Queue for managing drinks
 */

public class DrinkQueue {

    private final ArrayList<Drink> drinks;

    /**
     * Constructs a new DrinkQueue object
     */
    public DrinkQueue() {
        drinks = new ArrayList<>();
    }

    /**
     * Adds a new drink to the end of the queue
     * @param drink The drink to b added
     * @return true if the drink was added, otherwise false
     */

    public boolean offer(Drink drink) {
        if (drinks.contains(drink)) {
            return false;
        }
        drinks.add(drink);
        return true;
    }

    /**
     * Takes the first drink and deletes it from the array list
     * @return drink The first drink of the array list, if the list is not empty
     */
    public Drink poll() {
        Drink drink = peek();
        if (drink == null) {
            return null;
        }
        drinks.remove(drink);
        return drink;
    }

    /**
     * Removes the first drink from the array list
     * @return drink The first drink of the array list, if the list is not empty
     * @throws NoSuchElementException ("No drink in the queue")
     */
    public Drink remove() {
        Drink drink = peek();

        if (drink == null) {
            throw new NoSuchElementException("No drink in the queue");
        }
        drinks.remove(drink);
        return drink;
    }

    /**
     * Returns, but not removes the first drink of the queue
     * @return drink The first drink in the queue, otherwise null if the queue is empty
     */
    public Drink peek() {
        Drink drink;
        if (drinks.size() > 0) {
            drink = drinks.get(0);
        } else {
            drink = null;
        }
        return drink;
    }

    /**
     * Returns, but not remove the first drink of the queue
     * @return drink if the queue is not empty
     * @throws NoSuchElementException ("No drink in the queue")
     */
    public Drink element() {
        Drink drink = peek();

        if (drink == null) {
            throw new NoSuchElementException("No drink in the queue");
        }
        return drink;
    }

    /**
     * Gives the drink from the array list
     * @return drinks Array list of drinks
     */
    public ArrayList<Drink> getDrinks() {
        return drinks;
    }

}


