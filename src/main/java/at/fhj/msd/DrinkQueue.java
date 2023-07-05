package at.fhj.msd;

import java.util.LinkedList;
import java.util.Queue;

public class DrinkQueue implements IQueue{

    private LinkedList<Drink> drinks;

    public DrinkQueue() {
        drinks = new LinkedList<>();
    }

    public void printDrinkQueue() {
        for (Drink drink : drinks) {
            System.out.println(drink.getName());
        }
    }
    public void addDrinks(Drink drink) {
        drinks.add(drink);
    }
    public void removeDrink(Drink drink){
        drinks.remove(drink);
    }

    @Override
    public boolean offer(String obj) {
        return false;
    }

    @Override
    public String poll() {
        return null;
    }

    @Override
    public String remove() {
        return null;
    }

    @Override
    public String peek() {
        return null;
    }

    @Override
    public String element() {
        return null;
    }
}


