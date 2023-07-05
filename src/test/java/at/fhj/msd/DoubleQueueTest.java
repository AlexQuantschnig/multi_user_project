package at.fhj.msd;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test cases for the DoubleQueue class
 */
public class DoubleQueueTest {
    private DoubleQueue doubleQueue;

    /**
     * Set up the test data befor each test case
     */
    @BeforeEach
    public void setup() {
        doubleQueue = new DoubleQueue();
    }

    /**
     * Tests if the double values are added to the queue
     */
    @Test
    public void testOffer() {
        Assertions.assertTrue(doubleQueue.offer(3.14));
        Assertions.assertTrue(doubleQueue.offer(2.71));
        Assertions.assertTrue(doubleQueue.offer(1.618));
        Assertions.assertFalse(doubleQueue.offer(3.14));
    }
    /**
     * Test if the double values are poll right and have been deleted after polling
     */
    @Test
    public void testPoll() {
        doubleQueue.offer(3.14);
        doubleQueue.offer(2.71);
        doubleQueue.offer(1.618);

        assertEquals(3.14, doubleQueue.poll(), 0.001);
        Assertions.assertEquals(2.71, doubleQueue.poll(), 0.001);
        Assertions.assertEquals(1.618, doubleQueue.poll(), 0.001);
        Assertions.assertNull(doubleQueue.poll());
    }
    /**
     * Tests if the double values will be right removed from the queue
     */
    @Test
    public void testRemove() {
        doubleQueue.offer(3.14);
        doubleQueue.offer(2.71);

        Assertions.assertEquals(3.14, doubleQueue.remove(), 0.001);
        Assertions.assertEquals(2.71, doubleQueue.remove(), 0.001);
    }

    /**
     * Tests if the double values are right peeked , without deleting it
     */
    @Test
    public void testPeek() {
        doubleQueue.offer(3.14);
        doubleQueue.offer(2.71);

        Assertions.assertEquals(3.14, doubleQueue.peek(), 0.001);
        doubleQueue.poll();
        Assertions.assertEquals(2.71, doubleQueue.peek(), 0.001);
        doubleQueue.poll();
        Assertions.assertNull(doubleQueue.peek());
    }

    /**
     * Tests if the double values are right peeked , without deleting it
     */
    @Test
    public void testElement() {
        doubleQueue.offer(3.14);
        doubleQueue.offer(2.71);

        Assertions.assertEquals(3.14, doubleQueue.element(), 0.001);
        doubleQueue.poll();
        Assertions.assertEquals(2.71, doubleQueue.element(), 0.001);
    }
    /**
     * Tests if the queue results all elements
     */
    @Test
    public void testGetDoubles() {
        doubleQueue.offer(3.14);
        doubleQueue.offer(2.71);

        ArrayList<Double> expected = new ArrayList<>();
        expected.add(3.14);
        expected.add(2.71);

        Assertions.assertEquals(expected, doubleQueue.getDoubles());
    }
}
