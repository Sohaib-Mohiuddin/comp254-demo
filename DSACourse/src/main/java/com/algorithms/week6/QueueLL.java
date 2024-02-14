package com.algorithms.week6;

import java.util.NoSuchElementException;

public class QueueLL<T> {
    private Node<T> first, last;

    private static class Node<T> {
        T item;
        Node<T> next;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void enqueue(T item) {
        Node<T> oldLast = last;
        last = new Node<>();
        last.item = item;
        last.next = null;

        if (isEmpty()) {
            first = last;
        } else {
            oldLast.next = last;
        }
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        T item = first.item;
        first = first.next;

        if (isEmpty()) {
            last = null;
        }

        return item;
    }

    public void size() {
        int count = 0;
        Node<T> current = first;
        while (current != null) {
            count++;
            current = current.next;
        }
        System.out.println("Size of the queue: " + count);
    }

    public void print() {
        Node<T> current = first;
        while (current != null) {
            System.out.print(current.item + " ");
            current = current.next;
        }
        System.out.println();
    }
}
