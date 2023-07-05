package at.fhj.msd;

import java.util.ArrayList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        StringQueue queue = new StringQueue(5);

        for (int i = 0; i < 5; i++) {
            queue.offer("String " + i);
            System.out.println("Size of the queue: " + queue.getElements().toString());
        }
        System.out.println(queue.element());

        System.out.println("-".repeat(80));
        DrinkQueue drinkQueue = new DrinkQueue();
        SimpleDrink simpleDrink = new SimpleDrink("Vodka", new Liquid("Vodka", 0.02, 40));
        Cocktail cocktail = new Cocktail("Mojito", new ArrayList<>());

        drinkQueue.addDrinks(cocktail);
        drinkQueue.addDrinks(simpleDrink);
        drinkQueue.printDrinkQueue();

        System.out.println("-".repeat(80));
        drinkQueue.removeDrink(simpleDrink);
        drinkQueue.printDrinkQueue();

//        System.out.println("-".repeat(80));
//        drinkQueue.offer("Long Island");
//        drinkQueue.offer("B52");

    }



}