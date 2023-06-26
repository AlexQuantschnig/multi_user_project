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
        for(int i = 0; i < liquids.size(); i++) {
            volume += liquids.get(i).getVolume();
        }
        return volume;
    }

    @Override
    public double getAlcoholPercent() {
        double alcPercent = 0;
        for(int i = 0; i < liquids.size(); i++) {
            alcPercent += liquids.get(i).getAlcoholPercent()*liquids.get(i).getVolume();
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
