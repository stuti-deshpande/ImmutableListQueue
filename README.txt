ImmListQueue.java: README.txt
----------------------------
Immutable List Queue

Change this ListQueue class from the ListQueue assignment so that it is immutable. 
Note that you *will* have to change some method signatures, and you *may* have to add appropriate methods. 
You must keep the same implementation (ArrayList). 
You must provide Liskov-style specifications for all of the methods, as well as a Liskov-style OVERVIEW clause for the class (see Chapter 5). 
Assume that your immutable queue can only hold immutable objects and indicate this in the overview and in appropriate requires clauses. Name your immutable class ImmListQueue.

An list queue is an implementation of a FIFO queue. The constructor creates a new empty queue. The queue should not permit null elements. The appropriate methods with throw NullPointerExceptions if a null element would be added to the stack. An IllegalStateException should be thrown when trying to remove an element from an empty queue.

Complete the code for ListQueue using a Java ArrayList. Do not modify method signatures. Give Liskov-style specifications (REQUIRES, MODIFIES, and EFFECTS) for all methods and implementall the methods. The reverse method reverses the elements of the queue. The append method removes all of the elements from the specififed queue from first to last and appends them to the end of the current queue. swapFront swaps the specified element with the element at the front of the queue.

public class ListQueue<E> {
    public ListQueue() { ... }
    public void enqueue(E element) { ... }
    public E dequeue() throws ... { ... }
    public int length() { ... }
    public void reverse() { ... }
    public void append(ListQueue<E> s) { ... }
    public E swapFront(E element) throws ... { ... }
}

