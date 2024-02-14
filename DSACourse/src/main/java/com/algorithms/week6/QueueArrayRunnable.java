package com.algorithms.week6;

public class QueueArrayRunnable {
    public static void main(String[] args) {
        QueueArray<Integer> queue = new QueueArray<Integer>(5);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        queue.print();

        queue.dequeue();
        queue.dequeue();

        queue.print();
    }
}
