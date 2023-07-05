package at.fhj.msd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class StringQueueTest {
    private StringQueue queue;

    @BeforeEach
    public void setUp(){
        queue = new StringQueue(3);
    }

    @Test
    public void testOffer(){
        queue.offer("A");
        queue.offer("A");
        queue.offer("A");

        Assertions.assertFalse(queue.offer("A"));

    }

    @Test
    public void testPeek(){
        queue.offer("A");
        queue.offer("B");
        Assertions.assertEquals("A", queue.peek());
    }

    @Test
    public void testRemove(){
        queue.offer("A");
        queue.offer("B");
        Assertions.assertEquals("A", queue.remove());

        queue.remove();
        assertThrows(NoSuchElementException.class,()->queue.remove());
    }

    @Test
    public void testPoll(){
        queue.offer("A");
        queue.offer("B");

        Assertions.assertEquals("A", queue.poll());
    }

    @Test
    public void testElement(){
        queue.offer("A");
        queue.offer("B");

        Assertions.assertEquals("A",queue.element());
    }

}
