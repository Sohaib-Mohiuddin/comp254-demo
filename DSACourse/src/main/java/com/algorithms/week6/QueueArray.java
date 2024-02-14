package com.algorithms.week6;

import java.util.NoSuchElementException;

public class QueueArray<T> {
    private T[] queue;
    private int front;
    private int rear;
    private int size;

    public QueueArray(int capacity) {
        // Create an array of the generic type T
        queue = (T[]) new Object[capacity];
        front = 0;
        rear = 0;
        size = 0;
    }

    public void enqueue(T data) {
        if (size == queue.length) {
            throw new IllegalStateException("Queue is full");
        }
        queue[rear] = data;
        rear = (rear + 1) % queue.length;
        size++;
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        T data = queue[front];
        queue[front] = null; // Remove reference to the dequeued element to avoid memory leaks
        front = (front + 1) % queue.length;
        size--;
        return data;
    }

    public T peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return queue[front];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front + i) % queue.length] + " ");
        }
        System.out.println();
    }
}
