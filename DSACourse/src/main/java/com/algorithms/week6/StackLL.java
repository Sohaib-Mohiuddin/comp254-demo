package com.algorithms.week6;

import java.util.NoSuchElementException;

public class StackLL<T> {
    private Node<T> first = null;

    private static class Node<T> {
        T item;
        Node<T> next;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void push(T item) {
        Node<T> oldFirst = first;
        first = new Node<>();
        first.item = item;
        first.next = oldFirst;
    }

    public T pop() {
        if (isEmpty()) {
            throw new NoSuchElementException("Stack underflow");
        }
        T item = first.item;
        first = first.next;
        return item;
    }

    public T peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Stack underflow");
        }
        return first.item;
    }

    public void print() {
        Node<T> current = first;
        while (current != null) {
            System.out.println(current.item);
            current = current.next;
        }
    }
}
