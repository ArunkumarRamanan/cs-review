package com.mmnaseri.cs.clrs.ch10.s1;

import com.mmnaseri.cs.qa.annotation.Quality;
import com.mmnaseri.cs.qa.annotation.Stage;

/**
 * @author Mohammad Milad Naseri (mmnaseri@programmer.net)
 * @author Ramin Farhanian (rf.tech@icloud.com)
 * @since 1.0 (7/12/15, 9:29 PM)
 */
@Quality(Stage.TESTED)
public class FixedSizeStack<E> {

    private final Object[] items;
    private int top;

    public FixedSizeStack(int capacity) {
        items = new Object[capacity];
        top = 0;
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public void push(E item) {
        if (top < items.length) {
            items[top ++] = item;
        } else {
            throw new IllegalStateException("Stack is full");
        }
    }

    public E pop() {
        if (top == 0) {
            throw new IllegalStateException("Stack is empty");
        }
        //noinspection unchecked
        final E item = (E) items[--top];
        items[top] = null; // to avoid loitering
        return item;
    }

    public int getSize() {
        return top;
    }

}
