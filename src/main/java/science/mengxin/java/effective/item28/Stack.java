package science.mengxin.java.effective.item28;

import java.util.Collection;
import java.util.Iterator;

/**
 * User:    mengxin
 * Date:    29/09/2017
 * Project: effective-java
 * Package: science.mengxin.java.effective.item28
 * Description: Stack.
 *
 * @author mengxin
 * @version 1.0
 */
public class Stack<E> {

    public Stack() {

    }

    public void push(E e) {

    }

    public E pop() {
        return null;
    }

    public boolean isEmpty() {
        return false;
    }

    // pushAll method without wildcard type - deficient!
    public void pushAll(Iterable<E> src) {

        for (E e : src) {
            push(e);
        }
    }


    // Wildcard type for parameter that serves as an E producer
    public void pushAll2(Iterable<? extends E> src) {
        for (E e : src) {
            push(e);
        }
    }

    // popAll method without wildcard type - deficient!
    public void popAll(Collection<E> dst) {
        while (!isEmpty()) {
            dst.add(pop());
        }
    }

    // Wildcard type for parameter that serves as an E consumer
    public void popAll2(Collection<? super E> dst) {
        while (!isEmpty()) {
            dst.add(pop());
        }
    }

    // Little program to exercise our generic Stack
    public static void main(String[] args) {
        Stack<Number> numberStack = new Stack<Number>();
        Iterable<Integer> integers = new Iterable<Integer>() {
            @Override
            public Iterator<Integer> iterator() {
                return null;
            }
        };
        //numberStack.pushAll(integers);
        numberStack.pushAll2(integers);
    }
}
