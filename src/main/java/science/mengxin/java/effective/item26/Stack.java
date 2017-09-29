package science.mengxin.java.effective.item26;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * User:    mengxin
 * Date:    29/09/2017
 * Project: effective-java
 * Package: science.mengxin.java.effective.item26
 * Description: Stack.
 *
 * @author mengxin
 * @version 1.0
 */
// Object-based collection - a prime candidate for generics

public class Stack<E> {

    private E[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public Stack() {
        //we cannot new E [], As explained in Item 25, you can’t create an array of
        // a non-reifiable type, such as E.
        //elements = new E[DEFAULT_INITIAL_CAPACITY];

        //Method1: The first solution directly circumvents the prohibition on generic array creation: create an array of Object and cast it to the generic array type.
        // This method will get warning: warning: [unchecked] unchecked cast
        elements = (E[]) new Object[DEFAULT_INITIAL_CAPACITY];


        //Method2:
    }

    public void push(E e) {
        ensureCapacity();
        elements[size++] = e;
    }

    public E pop() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        E result = elements[--size];
        elements[size] = null; // Eliminate obsolete reference
        return result;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private void ensureCapacity() {
        if (elements.length == size) {
            elements = Arrays.copyOf(elements, 2 * size + 1);
        }
    }

}
