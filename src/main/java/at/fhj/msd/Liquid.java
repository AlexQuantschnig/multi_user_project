package at.fhj.msd;

    /**
    * Represents a Liquid which is used in drink
    */
public class Liquid {
    private String name;

    private double volume;

    private double alcoholPercent;

    /**
     * Constructs a liquid with name, volume and percentage of alcohol
     * @param name The specific name of the liquid
     * @param volume The volume of the liquid in litre
     * @param alcoholPercent The alcohol percentage of the liquid
     */

    public Liquid(String name, double volume, double alcoholPercent) {
        this.name = name;
        this.volume = volume;
        this.alcoholPercent = alcoholPercent;
    }

    /**
     * Returns the name of the liquid
     * @return The name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets a liquid a specific name
     * @param name The specific name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the set volume of the liquid
     * @return volume The volume of the liquid
     */
    public double getVolume() {
        return volume;
    }

    /**
     * Sets the volume of the liquid
     * @param volume The liquid volume in litre
     */
    public void setVolume(double volume) {
        this.volume = volume;
    }

    /**
     * Returns the alcohol percentage of the liquid
     * @return alcoholPercentage The percentage of alcohol of a liquid
     */
    public double getAlcoholPercent() {
        return alcoholPercent;
    }

    /**
     * Sets the alcohol percentage of the liquid
     * @param alcoholPercent The percentage of alcohol
     */
    public void setAlcoholPercent(double alcoholPercent) {
        this.alcoholPercent = alcoholPercent;
    }
}
