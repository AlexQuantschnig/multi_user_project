package at.fhj.msd;

import java.util.ArrayList;

public class Cocktail extends Drink {

    private ArrayList<Liquid> liquids;

    /**
     * Creates a Drink object with given name
     *
     * @param name name of the drink
     * @param liquids array of liquid
     */
    public Cocktail(String name, ArrayList<Liquid> liquids) {
        super(name);
        this.liquids = liquids;
    }

    /**
     * Calculates the volume of the drink and returns it
     * @return volume The volume of the drink
     */
    @Override
    public double getVolume() {
        double volume = 0;
        for (Liquid liquid : liquids) {
            volume += liquid.getVolume();
        }
        return volume;
    }

    /**
     * Calculates the alcohol percentage of the drink and returns it
     * @return alcPercent The percentage of alcohol
     */
    @Override
    public double getAlcoholPercent() {
        double alcPercent = 0;
        for (Liquid liquid : liquids) {
            alcPercent += liquid.getAlcoholPercent() * liquid.getVolume();
        }
        return alcPercent/getVolume();
    }

    /**
     * Checks if the drink contains alcohol
     * @return true if drink contains alcohol, otherwise false
     */
    @Override
    public boolean isAlcoholic() {
        if (getAlcoholPercent() == 0)
            return false;
        else
            return true;
    }
}
