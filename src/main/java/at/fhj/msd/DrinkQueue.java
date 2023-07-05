package at.fhj.msd;

import java.util.ArrayList;
import java.util.NoSuchElementException;


public class DrinkQueue {

    private final ArrayList<Drink> drinks;

    public DrinkQueue() {
        drinks = new ArrayList<>();
    }

    public boolean offer(Drink drink) {
        if (drinks.contains(drink)) {
            return false;
        }
        drinks.add(drink);
        return true;
    }

    public Drink poll() {
        Drink drink = peek();
        if (drink == null) {
            return null;
        }
        drinks.remove(drink);
        return drink;
    }

    public Drink remove() {
        Drink drink = peek();

        if (drink == null) {
            throw new NoSuchElementException("No drink in the queue");
        }
        drinks.remove(drink);
        return drink;
    }

    public Drink peek() {
        Drink drink;
        if (drinks.size() > 0) {
            drink = drinks.get(0);
        } else {
            drink = null;
        }
        return drink;
    }

    public Drink element() {
        Drink drink = peek();

        if (drink == null) {
            throw new NoSuchElementException("No drink in the queue");
        }
        return drink;
    }
    public ArrayList<Drink> getDrinks() {
        return drinks;
    }


}


