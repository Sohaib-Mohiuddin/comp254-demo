package com.algorithms.week6;

public class StackArrayRunnable {
    public static void main(String[] args) {
        StackArray<Integer> stack = new StackArray<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println("Stack size: " + stack.size());

        System.out.println("Stack pop: " + stack.pop());
        stack.print();
        System.out.println("Stack size: " + stack.size());

        stack.push(7);
        stack.push(8);
        stack.push(9);
        stack.push(11);
        stack.push(55);

        System.out.println("Stack pop: " + stack.pop());
        stack.print();
        System.out.println("Stack size: " + stack.size());
    }
}
