package com.algorithms.week5;

import com.algorithms.utils.JsonReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.IOException;

public class BinarySearch {

    private static final Logger logger = LoggerFactory.getLogger(BinarySearch.class);

    // Binary Search Algorithm
    // This algorithm searches for a target value in a sorted array by repeatedly dividing the search space in half.
    public static void binarySearch(String keyName, int target) {
        int[] arr = null;

        try {
            arr = JsonReader.readJsonArray(keyName);
            if (arr.length > 0) {
                System.out.println("Size of current JSON loaded array -- " + arr.length);
            }
            long startTime = System.nanoTime();

            int left = 0; // 2 primitive operation (init, assignment)
            int right = arr.length - 1; // 2 primitive operations (init, array length retrieval, subtraction)
            boolean found = false; // 2 primitive operation (init, assignment)
            while (left <= right) { // 1 primitive operation (comparison)
                int mid = left + (right - left) / 2; // 3 primitive operations (subtraction, division, addition)
                if (arr[mid] == target) { // 2 primitive operations (array element retrieval, comparison)
                    found = true; // 1 primitive operation (assignment)
                    break; // 1 primitive operation (loop termination)
                } else if (arr[mid] < target) { // 2 primitive operations (array element retrieval, comparison)
                    left = mid + 1; // 2 primitive operations (addition, assignment)
                } else {
                    right = mid - 1; // 2 primitive operations (subtraction, assignment)
                }
            }

            long endTime = System.nanoTime();

            long duration = endTime - startTime; // 1 primitive operation (subtraction)

            System.out.println("Target found: " + found); // 2 primitive operations (string concatenation, output)
            System.out.println("Binary Search Regular Execution Time: " + duration + " nanoseconds"); // 3 primitive operations (string concatenation, output)
        } catch (IOException e) {
            logger.error("An error occurred:", e);
        }

        /*
         * The time complexity of the binary search algorithm is O(log n) where n is the number of elements in the array.
         * The Running Time of the binary search algorithm is logarithmic to the number of elements in the array.
         *
         */
    }

    /* Binary Search Recursive Algorithm
     * This algorithm searches for a target value in a sorted array by repeatedly dividing the search space in half.
     * Time Complexity: O(log n)
     */
    public static void BSRecursive(String keyName, int target) {
        int[] arr = null;

        try {
            arr = JsonReader.readJsonArray(keyName);
            if (arr.length > 0) {
                System.out.println("Size of current JSON loaded array -- " + arr.length);
            }

            long startTime = System.nanoTime();

            boolean found = false;
            int low = 0;
            int high = arr.length - 1;
            int result = BinarySearchRecursive.binarySearch(arr, low, high, target);

            if (result != -1) {
                found = true;
            }

            long endTime = System.nanoTime();
            long duration = (endTime - startTime);

            System.out.println("Target value found: " + found);
            System.out.println("Binary Search Recursive Algorithm Execution Time: " + duration + " nanoseconds");
        } catch (IOException e) {
            logger.error("An error occurred:", e);
        }
    }

    /* Resursive Summation Algorithm
     * This algorithm calculates the sum of the first n natural numbers using recursion.
     * Time Complexity: O(n)
     */
    public static int factorial(int n) {
//        long startTime = System.nanoTime();

        if (n < 0) {
            throw new IllegalArgumentException();
        } else if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }

//        long endTime = System.nanoTime();
//        long duration = (endTime - startTime);
//        System.out.println("Sum of first " + n + " natural numbers: " + result);
//        System.out.println("Recursive Summation Algorithm Execution Time: " + duration + " nanoseconds");
    }
}