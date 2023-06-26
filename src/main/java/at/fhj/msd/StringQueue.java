package at.fhj.msd;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

//ToDo: Write Testcases for this class
public class StringQueue implements IQueue {

  private final List<String> elements = new ArrayList<>();
  private final int maxSize;

  public StringQueue(int maxSize) {
    this.maxSize = maxSize;
  }
  @Override
  public boolean offer(String obj) {
    if (elements.size() != maxSize)
      elements.add(obj);
    else
      return false;

    return true;
  }

  @Override
  public String poll() {
    String element = peek();
    if (element == null)
      return null;

    elements.remove(element);
    return element;
  }

  @Override
  public String remove() {
    String element = peek();
    if (element==null){
      throw new NoSuchElementException("there's no element any more");
    }
    elements.remove(0);
    return element;
  }

  @Override
  public String peek() {
    String element;
    if (elements.size() > 0)
      element = elements.get(0);
    else
      element = null;

    return element;
  }

  @Override
  public String element() {
    String element = peek();
    if (element == null)
      throw new NoSuchElementException("there's no element any more");

    return element;
  }

  public List<String> getElements() {
    return elements;
  }

  public int getMaxSize() {
    return maxSize;
  }
}