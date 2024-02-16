package com.algorithms.week6;

import java.util.NoSuchElementException;

public class StackArray<T> {
    private T[] stack;
    private int top;
    private int size;

    public StackArray() {
        // Initialize the stack with an initial capacity of 1
        stack = (T[]) new Object[1];
        top = -1;
        size = 0;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return size;
    }

    public void push(T item) {
        if (top == stack.length - 1) {
            resize(2 * stack.length);
        }
        stack[++top] = item;
        size++;
    }

    public T pop() {
        if (isEmpty()) {
            throw new NoSuchElementException("Stack underflow");
        }
        T item = stack[top];
        stack[top--] = null; // Remove reference to the popped item to avoid memory leaks
        size--;
        if (size > 0 && size == stack.length / 4) {
            resize(stack.length / 2);
        }
        return item;
    }

    public T peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Stack underflow");
        }
        return stack[top];
    }

    private void resize(int capacity) {
        T[] copy = (T[]) new Object[capacity];
        for (int i = 0; i <= top; i++) {
            copy[i] = stack[i];
        }
        stack = copy;
    }

    public void print() {
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }
}
