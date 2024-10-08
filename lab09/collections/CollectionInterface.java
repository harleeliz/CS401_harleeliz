/////////////////////////////////////////////////////////////////////
//CS 401 Introduction to Advanced Studies I
//Student:      Harlee Liz Ramos
//Due date:     04/10/2024  
//Program Name: CollectionInterface.java
/////////////////////////////////////////////////////////////////////
package lab09.collections;

public interface CollectionInterface< T > {
    boolean add ( T element );
    // Attempts to add element to this collection.
    // Returns true if successful, false otherwise.

    T get ( long T );
    // Returns an element e from this collection such that e.equals(target).
    // If no such e exists, returns null.

    boolean contains ( T target );
    // Returns true if this collection contains an element e such that
    // e.equals(target); otherwise returns false.

    boolean remove ( T target );
    // Removes an element e from this collection such that e.equals(target)
    // and returns true. If no such e exists, returns false.

    boolean isFull ( );
    // Returns true if this collection is full; otherwise, returns false.

    boolean isEmpty ( );
    // Returns true if this collection is empty; otherwise, returns false.

    int size ( );
    // Returns the number of elements in this collection.
}
