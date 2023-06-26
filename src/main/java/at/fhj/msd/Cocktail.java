package at.fhj.msd;

import java.util.ArrayList;

public class Cocktail extends Drink {

    private ArrayList<Liquid> liquids;

    /**
     * Creates a Drink object with given name
     *
     * @param name name of the drink
     */
    public Cocktail(String name, ArrayList<Liquid> liquids) {
        super(name);
        this.liquids = liquids;
    }

    @Override
    public double getVolume() {
        double volume = 0;
        for (Liquid liquid : liquids) {
            volume += liquid.getVolume();
        }
        return volume;
    }

    @Override
    public double getAlcoholPercent() {
        double alcPercent = 0;
        for (Liquid liquid : liquids) {
            alcPercent += liquid.getAlcoholPercent() * liquid.getVolume();
        }
        return alcPercent/getVolume();
    }

    @Override
    public boolean isAlcoholic() {
        if (getAlcoholPercent() == 0)
            return false;
        else
            return true;
    }
}
