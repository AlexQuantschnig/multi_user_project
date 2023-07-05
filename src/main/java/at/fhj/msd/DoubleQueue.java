package at.fhj.msd;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class DoubleQueue {
    private final ArrayList<Double> doubles;

    public DoubleQueue() {
        doubles = new ArrayList<>();
    }

    public boolean offer(Double nm) {
        if (doubles.contains(nm)) {
            return false;
        }
        doubles.add(nm);
        return true;
    }

    public Double poll() {
        Double nm = peek();
        if (nm == null) {
            return null;
        }
        doubles.remove(nm);
        return nm;
    }

    public Double remove() {
        Double nm = peek();

        if (nm == null) {
            throw new NoSuchElementException("No double value left!");
        }
        doubles.remove(nm);
        return nm;
    }

    public Double peek() {
        Double nm;
        if (doubles.size() > 0) {
            nm = doubles.get(0);
        } else {
            nm = null;
        }
        return nm;
    }

    public Double element() {
        Double nm = peek();

        if (nm == null) {
            throw new NoSuchElementException("No double value left!");
        }
        return nm;
    }

    public ArrayList<Double> getDoubles() {
        return doubles;
    }
}