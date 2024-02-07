package com.algorithms.week4;

import com.algorithms.utils.JsonReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class Algorithms {
    private static final Logger logger = LoggerFactory.getLogger(Algorithms.class);

    // Linear Search Algorithm
    // This algorithm searches for a target value in an array by checking each element in the array.
    public static void linearSearch(String keyName, int target) {
        int[] arr = null;

        try {
            arr = JsonReader.readJsonArray(keyName); // 1 primitive operation (variable initialization)
            if (arr.length > 0) {
                System.out.println("Size of current JSON loaded array -- " + arr.length);
            }
            long startTime = System.nanoTime(); // 1 primitive operation (method call)
            boolean found = false; // 2 primitive operation (assignment)
            for (int i : arr) { // 3 primitive operations (variable initialization, comparison, increment)
                if (i == target) { // 2 primitive operations (array element retrieval, comparison)
                    found = true; // 1 primitive operation (assignment)
                    break; // 1 primitive operation (loop termination)
                }
            }

            long endTime = System.nanoTime(); // 1 primitive operation (method call)
            long duration = endTime - startTime; // 1 primitive operation (subtraction)

            System.out.println("Target found: " + found); // 2 primitive operations (string concatenation, output)
            System.out.println("Time taken: " + duration + " nanoseconds\n"); // 3 primitive operations (string concatenation, output)
        } catch (IOException e) {
            logger.error("An error occurred:", e);
        }

        /*
         * The time complexity of the linear search algorithm is O(n) where n is the number of elements in the array.
         * The Running Time of the linear search algorithm is directly proportional to the number of elements in the array.
         * 
         */
    }

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
            System.out.println("Time taken: " + duration + " nanoseconds"); // 3 primitive operations (string concatenation, output)
        } catch (IOException e) {
            logger.error("An error occurred:", e);
        }

        /*
         * The time complexity of the binary search algorithm is O(log n) where n is the number of elements in the array.
         * The Running Time of the binary search algorithm is logarithmic to the number of elements in the array.
         * 
         */
    }

    // Selection Sort Algorithm
    // This algorithm sorts an array by repeatedly finding the minimum element from the unsorted part and putting it at the beginning.
    public static void selectionSort(String keyName) {
        int[] arr = null;

        try {
            arr = JsonReader.readJsonArray(keyName);
            if (arr.length > 0) {
                System.out.println("Size of current JSON loaded array -- " + arr.length);
            }
            long startTime = System.nanoTime();

            int n = arr.length; // 1 primitive operation (assignment)
            for (int i = 0; i < n - 1; i++) { // 3 primitive operations (variable initialization, comparison, increment)
                int minIndex = i; // 1 primitive operation (assignment)
                for (int j = i + 1; j < n; j++) { // 4 primitive operations (variable initialization, comparison, addition, increment)
                    if (arr[j] < arr[minIndex]) { // 3 primitive operations (array element retrieval, array element retrieval, comparison)
                        minIndex = j; // 1 primitive operation (assignment)
                    }
                }
                int temp = arr[minIndex]; // 1 primitive operation (assignment)
                arr[minIndex] = arr[i]; // 2 primitive operations (array element retrieval, assignment)
                arr[i] = temp; // 2 primitive operations (array element retrieval, assignment)
            }

            long endTime = System.nanoTime();

            long duration = endTime - startTime; // 1 primitive operation (subtraction)

            System.out.println("Sorted array: "); // 1 primitive operation (output)
            for (int i : arr) { // 3 primitive operations (variable initialization, comparison, increment)
                System.out.print(i + " "); // 2 primitive operations (string concatenation, output)
            }
            System.out.println(); // 1 primitive operation (output)
            System.out.println("Time taken: " + duration + " nanoseconds"); // 3 primitive operations (string concatenation, output)
        } catch (IOException e) {
            logger.error("An error occurred:", e);
        }
    }

    // Bubble Sort Algorithm
    // This algorithm sorts an array by repeatedly swapping adjacent elements if they are in the wrong order.
    public static void bubbleSort(String keyName) {
        int[] arr = null;

        try {
            arr = JsonReader.readJsonArray(keyName);
            if (arr.length > 0) {
                System.out.println("Size of current JSON loaded array -- " + arr.length);
            }
            long startTime = System.nanoTime();

            int n = arr.length; // 1 primitive operation (assignment)
            for (int i = 0; i < n - 1; i++) { // 3 primitive operations (variable initialization, comparison, increment)
                for (int j = 0; j < n - i - 1; j++) { // 4 primitive operations (variable initialization, comparison, subtraction, increment)
                    if (arr[j] > arr[j + 1]) { // 3 primitive operations (array element retrieval, array element retrieval, comparison)
                        int temp = arr[j]; // 1 primitive operation (assignment)
                        arr[j] = arr[j + 1]; // 2 primitive operations (array element retrieval, assignment)
                        arr[j + 1] = temp; // 2 primitive operations (array element retrieval, assignment)
                    }
                }
            }

            long endTime = System.nanoTime();

            long duration = endTime - startTime; // 1 primitive operation (subtraction)

            System.out.println("Sorted array: "); // 1 primitive operation (output)
            for (int i : arr) { // 3 primitive operations (variable initialization, comparison, increment)
                System.out.print(i + " "); // 2 primitive operations (string concatenation, output)
            }
            System.out.println(); // 1 primitive operation (output)
            System.out.println("Time taken: " + duration + " nanoseconds"); // 3 primitive operations (string concatenation, output)
        } catch (IOException e) {
            logger.error("An error occurred:", e);
        }
    }

    // Merge Sort Algorithm
    // This algorithm sorts an array by dividing it into two halves, sorting the halves, and then merging them.
    public static void mergeSortCallback(String keyName) {
        MergeSort.mergeSort(keyName);
    }
}