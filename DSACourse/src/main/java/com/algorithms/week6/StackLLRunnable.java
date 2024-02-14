package com.algorithms.week6;

public class StackLLRunnable {
    public static void main(String[] args) {
        StackLL<Integer> stack = new StackLL<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.print();
        System.out.println("Pop: " + stack.pop());
        stack.print();
        System.out.println("Peek: " + stack.peek());
        stack.print();
    }
}
