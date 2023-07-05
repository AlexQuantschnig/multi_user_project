package at.fhj.msd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.NoSuchElementException;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Test cases for the StringQueue class
 */
public class StringQueueTest {
    private StringQueue queue;

    /**
     * Sets up the values befor every test case
     */
    @BeforeEach
    public void setUp(){
        queue = new StringQueue(3);
    }

    /**
     * Tests if values are added to the queue
     */
    @Test
    public void testOffer(){
        queue.offer("A");
        queue.offer("A");
        queue.offer("A");

        Assertions.assertFalse(queue.offer("A"));

    }
    /**
     * Tests if the values are right peeked , without deleting it
     */
    @Test
    public void testPeek(){
        queue.offer("A");
        queue.offer("B");
        Assertions.assertEquals("A", queue.peek());
    }
    /**
     * Tests if the values will be right removed from the queue
     */
    @Test
    public void testRemove(){
        queue.offer("A");
        queue.offer("B");
        Assertions.assertEquals("A", queue.remove());

        queue.remove();
        assertThrows(NoSuchElementException.class,()->queue.remove());
    }
    /**
     * Test if the values are poll right and have been deleted after polling
     */

    @Test
    public void testPoll(){
        queue.offer("A");
        queue.offer("B");

        Assertions.assertEquals("A", queue.poll());
    }
    /**
     * Tests if the values are right peeked , without deleting it
     */
    @Test
    public void testElement(){
        queue.offer("A");
        queue.offer("B");

        Assertions.assertEquals("A",queue.element());
    }

}
