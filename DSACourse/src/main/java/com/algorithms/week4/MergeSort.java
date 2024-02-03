package com.algorithms.week4;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MergeSort {
    private static final Logger logger = LoggerFactory.getLogger(MergeSort.class);
    // Merge Sort Algorithm
    // This algorithm sorts an array by dividing it into two halves, sorting the halves, and then merging them.
    public static void mergeSort(String keyName) {
        int[] arr = null;

        try {
            arr = JsonReader.readJsonArray(keyName);
            if (arr.length > 0) {
                System.out.println("Size of current JSON loaded array -- " + arr.length);
            }
            long startTime = System.nanoTime();

            int left = arr[0]; // 1 primitive operation (array element retrieval)
            int right = arr[arr.length - 1]; // 2 primitive operations (array length retrieval, subtraction)

            mergeLeftRight(arr, left, right);
        } catch (IOException e) {
            logger.error("An error occurred:", e);
        }
    }

    private static void mergeLeftRight(int[] arr, int left, int right) {
        if (left < right) { // 1 primitive operation (comparison)
            int mid = (left + right) / 2; // 3 primitive operations (addition, division, assignment)
            mergeLeftRight(arr, left, mid); // 3 primitive operations (method call, array, left, mid)
            mergeLeftRight(arr, mid + 1, right); // 3 primitive operations (method call, array, addition, right)
            merge(arr, left, mid, right); // 3 primitive operations (method call, array, left, mid, right)
        }
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1; // 2 primitive operations (subtraction, addition)
        int n2 = right - mid; // 2 primitive operations (subtraction, addition)

        int[] leftArr = new int[n1]; // 2 primitive operations (array creation, assignment)
        int[] rightArr = new int[n2]; // 2 primitive operations (array creation, assignment)

        for (int i = 0; i < n1; i++) { // 3 primitive operations (variable initialization, comparison, increment)
            leftArr[i] = arr[left + i]; // 2 primitive operations (array element retrieval, assignment)
        }
        for (int j = 0; j < n2; j++) { // 3 primitive operations (variable initialization, comparison, increment)
            rightArr[j] = arr[mid + 1 + j]; // 2 primitive operations (array element retrieval, assignment)
        }

        int i = 0, j = 0; // 2 primitive operations (variable initialization)
        int k = left; // 1 primitive operation (assignment) 
        while (i < n1 && j < n2) { // 2 primitive operations (comparison, logical AND)
            if (leftArr[i] <= rightArr[j]) { // 2 primitive operations (array element retrieval, comparison)
                arr[k] = leftArr[i]; // 2 primitive operations (array element retrieval, assignment)
                i++; // 1 primitive operation (increment)
            } else {
                arr[k] = rightArr[j]; // 2 primitive operations (array element retrieval, assignment)
                j++; // 1 primitive operation (increment)
            }
            k++; // 1 primitive operation (increment)
        }
 
        while (i < n1) { // 1 primitive operation (comparison)
            arr[k] = leftArr[i]; // 2 primitive operations (array element retrieval, assignment) 
            i++; // 1 primitive operation (increment)
            k++; // 1 primitive operation (increment)
        }

        while (j < n2) { // 1 primitive operation (comparison)
            arr[k] = rightArr[j]; // 2 primitive operations (array element retrieval, assignment)
            j++; // 1 primitive operation (increment)
            k++; // 1 primitive operation (increment)
        }
    }

    /*
     * The running time of this algorithm is O(n log n), where n is the number of elements in the array.
     * This is because the algorithm divides the array into two halves and sorts each half before merging them.
     * The merge operation takes O(n) time, and the algorithm makes O(log n) such operations.
     * Therefore, the total running time is O(n log n).
     */
}