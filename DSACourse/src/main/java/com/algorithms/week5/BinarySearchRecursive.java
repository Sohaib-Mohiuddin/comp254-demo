package com.algorithms.week5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BinarySearchRecursive {

    private static final Logger logger = LoggerFactory.getLogger(BinarySearchRecursive.class);

    // Binary Search Recursive Algorithm
    public static int binarySearch(int[] arr, int low, int high, int target) {
        if (high >= low) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] > target) {
                return binarySearch(arr, low, mid - 1, target);
            }
            return binarySearch(arr, mid + 1, high, target);
        }
        return -1;
    }
}