package at.fhj.msd;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("-".repeat(80));
        DrinkQueue drinkQueue = new DrinkQueue();
        SimpleDrink simpleDrink = new SimpleDrink("Vodka", new Liquid("Vodka", 0.02, 40));

        System.out.println(drinkQueue.offer(simpleDrink));

        System.out.println(drinkQueue.getDrinks().toString());
        System.out.println(drinkQueue.element());
        System.out.println(drinkQueue.getDrinks().toString());

        drinkQueue.remove();

//        System.out.println("-".repeat(80));
//        drinkQueue.offer("Long Island");
//        drinkQueue.offer("B52");

    }



}