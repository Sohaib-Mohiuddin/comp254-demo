package com.algorithms;

import com.algorithms.week4.*;
import com.algorithms.week5.*;

/**
 * Algorithm Analysis
 */
public class App {
    public static void week4Runnable() {
        /*
         * Linear Search Run Times
         * 5k.json 250k ns; 10k.json 300k ns; 20k.json 2.48 ms; 50k.json ~3ms, ~4ms; 100k.json ~9.7ms
         */
        Algorithms.linearSearch("100k", 99999);

        /*
         * Binary Search Run Times
         * 5k.json 3000 ns; 10k.json 3000 ns; 20k.json 4000 ns; 50k.json 5000 ns; 100k.json 5500 ns
         */
        Algorithms.binarySearch("100k", 99999);

        // Algorithms.bubbleSort("20k_random");
        // Algorithms.selectionSort("20k_random");
    }
    public static void week5Runnable() {
//        BinarySearch.binarySearch("5k", 2500);

//        BinarySearch.BSRecursive("5k", 4999);
        long start = System.currentTimeMillis();
        System.out.println(BinarySearch.factorial(30));
        long end = System.currentTimeMillis();
        System.out.println("Factorial: " + (end - start) + " ms");
    }
    public static void main(String[] args) {
        // week4Runnable();

        week5Runnable();
    }
}
