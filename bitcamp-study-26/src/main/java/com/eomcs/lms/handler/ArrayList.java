package com.eomcs.lms.handler;

import java.util.Arrays;
import com.eomcs.lms.domain.Board;

public class ArrayList {
  final int DEFAULT_CAPACITY = 10;
  Object[] elementDate;
  int size = 0;
  
  public ArrayList() {
    elementDate  = new Object[DEFAULT_CAPACITY];
  }
  
  public ArrayList(int initialCapacity) {
    if (initialCapacity > DEFAULT_CAPACITY) 
    	elementDate = new Object[initialCapacity];
    else
    	elementDate = new Object[DEFAULT_CAPACITY];
  }
  
  public Object[] toArray() {
    return Arrays.copyOf(elementDate, size); 
  }
  
  public void add(Object obj) {
    if (size >= elementDate.length) {
      int oldCapacity = elementDate.length;
      int newCapacity = oldCapacity + (oldCapacity >> 1);
      elementDate = Arrays.copyOf(elementDate, newCapacity);
    }
    
    elementDate[size++] = obj;
  }
}
