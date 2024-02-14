package com.algorithms.week6;

public class QueueLLRunnable {
    public static void main(String[] args) {
        QueueLL<Integer> queue = new QueueLL<Integer>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        System.out.println(queue.dequeue());

        queue.print();

        System.out.println(queue.dequeue());

        queue.print();
        queue.size();

        System.out.println(queue.dequeue());

        queue.print();
        queue.size();
    }
}
