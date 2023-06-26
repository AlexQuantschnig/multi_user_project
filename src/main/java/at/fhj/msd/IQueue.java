package at.fhj.msd;
public interface IQueue {

  /**
   * Adds the element obj to the queue.
   * @param obj  element to be added
   * @return true if element has been added, otherwise false
   */
  public abstract boolean offer(String obj);

  /**
   * Returns the head (first) element and also deletes it.
   * @return element or null
   */
  public abstract String poll();

  /**
   * Returns the head (first) element and also deletes it.
   * @return head element of the queue if there are any, otherwise throw NoSuchElementException
   */
  public abstract String remove();

  /**
   * Returns the head (first) element, but it does not delete it.
    * @return head element of the queue if there are any, otherwise null
   */
  public abstract String peek();

  /**
   * It works similar to peek() but throws NoSuchElementException if there is no element to return
   * @return head element of the queue
   */
  public abstract String element();
}