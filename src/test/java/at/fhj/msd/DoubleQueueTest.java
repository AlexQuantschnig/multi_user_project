package at.fhj.msd;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DoubleQueueTest {
    private DoubleQueue doubleQueue;

    @BeforeEach
    public void setup() {
        doubleQueue = new DoubleQueue();
    }

    @Test
    public void testOffer() {
        Assertions.assertTrue(doubleQueue.offer(3.14));
        Assertions.assertTrue(doubleQueue.offer(2.71));
        Assertions.assertTrue(doubleQueue.offer(1.618));
        Assertions.assertFalse(doubleQueue.offer(3.14));
    }

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

    @Test
    public void testRemove() {
        doubleQueue.offer(3.14);
        doubleQueue.offer(2.71);

        Assertions.assertEquals(3.14, doubleQueue.remove(), 0.001);
        Assertions.assertEquals(2.71, doubleQueue.remove(), 0.001);
        assertThrows(NoSuchElementException.class, () -> doubleQueue.remove());
    }

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

    @Test
    public void testElement() {
        assertThrows(NoSuchElementException.class, () -> doubleQueue.element());
        doubleQueue.offer(3.14);
        doubleQueue.offer(2.71);

        Assertions.assertEquals(3.14, doubleQueue.element(), 0.001);
        doubleQueue.poll();
        Assertions.assertEquals(2.71, doubleQueue.element(), 0.001);
    }

}
