package at.fhj.msd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

public class StringQueueTest {

    @Test
    public void testOffer() {
        StringQueue queue = new StringQueue(3);

        Assertions.assertTrue(queue.offer("A"));
        Assertions.assertTrue(queue.offer("B"));
        Assertions.assertTrue(queue.offer("C"));
        Assertions.assertFalse(queue.offer("D"));
    }

    @Test
    public void testPoll() {
        StringQueue queue = new StringQueue(3);

        queue.offer("A");
        queue.offer("B");
        queue.offer("C");

        Assertions.assertEquals("A", queue.poll());
        Assertions.assertEquals("B", queue.poll());
        Assertions.assertEquals("C", queue.poll());
        Assertions.assertNull(queue.poll());
    }

    @Test
    public void testRemove() {
        StringQueue queue = new StringQueue(3);

        queue.offer("A");
        queue.offer("B");
        queue.offer("C");

        Assertions.assertEquals("A", queue.remove());
        Assertions.assertEquals("B", queue.remove());
        Assertions.assertEquals("C", queue.remove());
        try {
            queue.remove();
            Assertions.fail("Expected NoSuchElementException was not thrown");
        } catch (NoSuchElementException e) {
            // Exception caught as expected
        }
    }

    @Test
    public void testPeek() {
        StringQueue queue = new StringQueue(3);

        queue.offer("A");
        queue.offer("B");
        queue.offer("C");

        Assertions.assertEquals("A", queue.peek());
        Assertions.assertEquals("A", queue.peek());
        queue.remove();
        Assertions.assertEquals("B", queue.peek());
        queue.remove();
        Assertions.assertEquals("C", queue.peek());
        queue.remove();
        Assertions.assertNull(queue.peek());
    }

    @Test
    public void testElement() {
        StringQueue queue = new StringQueue(3);

        queue.offer("A");
        queue.offer("B");
        queue.offer("C");

        Assertions.assertEquals("A", queue.element());
        Assertions.assertEquals("A", queue.element());
        queue.remove();
        Assertions.assertEquals("B", queue.element());
        queue.remove();
        Assertions.assertEquals("C", queue.element());
        queue.remove();
        try {
            queue.element();
            Assertions.fail("Expected NoSuchElementException was not thrown");
        } catch (NoSuchElementException e) {
            // Exception caught as expected
        }
    }
}
