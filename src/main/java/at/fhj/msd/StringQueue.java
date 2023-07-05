package at.fhj.msd;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * Data structure: Queue for storing String elements
 */
//ToDo: Write Testcases for this class
public class StringQueue implements IQueue {

  private final List<String> elements = new ArrayList<>();
  private final int maxSize;

  /**
   * Constructs a Queue object with a specific maximum size
   * @param maxSize The maxim size of the list
   */
  public StringQueue(int maxSize) {
    this.maxSize = maxSize;
  }

  /**
   * If the maximum size is not reached, adds the String object to the end of the list
   * @param obj  The element to be added
   * @return true if the element was added, otherwise false
   */
  @Override
  public boolean offer(String obj) {
    if (elements.size() != maxSize)
      elements.add(obj);
    else
      return false;

    return true;
  }

  /**
   * Returns the head (first) element and also deletes it.
   * @return element or null
   */
  @Override
  public String poll() {
    String element = peek();
    if (element == null)
      return null;

    elements.remove(element);
    return element;
  }

  /**
   * Returns the head (first) element and also deletes it.
   * @return head element of the queue if there are any, otherwise throw NoSuchElementException
   */
  @Override
  public String remove() {
    String element = peek();
    if (element==null){
      throw new NoSuchElementException("there's no element any more");
    }
    elements.remove(0);
    return element;
  }
  /**
   * Returns the head (first) element, but it does not delete it.
   * @return head element of the queue if there are any, otherwise null
   */
  @Override
  public String peek() {
    String element;
    if (elements.size() > 0)
      element = elements.get(0);
    else
      element = null;

    return element;
  }
  /**
   * It works similar to peek() but throws NoSuchElementException if there is no element to return
   * @return head element of the queue
   */
  @Override
  public String element() {
    String element = peek();
    if (element == null)
      throw new NoSuchElementException("there's no element any more");

    return element;
  }

  /**
   * Returns the list of elements in the queue
   * @return elements The list of all elements
   */
  public List<String> getElements() {
    return elements;
  }

  /**
   * Returns maximum size of the list
   * @return maxSize The mximum size of the list
   */
  public int getMaxSize() {
    return maxSize;
  }
}