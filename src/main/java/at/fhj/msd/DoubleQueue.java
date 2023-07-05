package at.fhj.msd;

import java.util.ArrayList;
import java.util.NoSuchElementException;

/**
 * Data structure: Queue string doubles
 */
public class DoubleQueue {
    private final ArrayList<Double> doubles;

    /**
     * Constructs a new DoubleQueue objects
     */
    public DoubleQueue() {
        doubles = new ArrayList<>();
    }
    /**
     * Adds the element obj to the queue
     * @parm nm Checks if the nm was added
     * @return true if element has been added, otherwise false
     */
    public boolean offer(Double nm) {
        if (doubles.contains(nm)) {
            return false;
        }
        doubles.add(nm);
        return true;
    }

    /**
     * Returns the head (first) nm and also deletes it.
     * @return nm or null
     */
    public Double poll() {
        Double nm = peek();
        if (nm == null) {
            return null;
        }
        doubles.remove(nm);
        return nm;
    }
    /**
     * Returns the head (first) nm and also deletes it.
     * @return head nm of the queue if there are any, otherwise throw NoSuchElementException
     */
    public Double remove() {
        Double nm = peek();

        if (nm == null) {
            throw new NoSuchElementException("No double value left!");
        }
        doubles.remove(nm);
        return nm;
    }
    /**
     * Returns the head (first) nm, but it does not delete it.
     * @return head nm of the queue if there are any, otherwise null
     */
    public Double peek() {
        Double nm;
        if (doubles.size() > 0) {
            nm = doubles.get(0);
        } else {
            nm = null;
        }
        return nm;
    }
    /**
     * It works similar to peek() but throws NoSuchElementException if there is no element to return
     * @return head nm of the queue
     */
    public Double element() {
        Double nm = peek();

        if (nm == null) {
            throw new NoSuchElementException("No double value left!");
        }
        return nm;
    }

}