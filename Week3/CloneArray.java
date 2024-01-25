package Week3;

import java.util.Arrays;

/**
 * CloneArray
 */
public class CloneArray {
    public static void shallowCloneArray(int[] arr) {
        int[] clone = arr.clone();
        System.out.println("Shallow clone: ");
        System.out.println("arr == clone: " + (arr == clone));
        System.out.println("arr.equals(clone): " + customArrayEquals(arr, clone));
        System.out.println("arr[0] == clone[0]: " + (arr[0] == clone[0]));
        System.out.println((Arrays.equals(arr, clone)));
    }

    /**
     * Deep clone array
     * @param arr
     */
    public static void deepCloneArray(int[] arr) {
        int[] clone = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            clone[i] = arr[i];
        }
        System.out.println("Deep clone: ");
        System.out.println("arr == clone: " + (arr == clone));
        System.out.println("arr.equals(clone): " + customArrayEquals(arr, clone));
        System.out.println("arr[0] == clone[0]: " + (arr[0] == clone[0]));
    }

    /**
     * Multi-dimensional array clone
     * @param arr
     */
    public static void multiDimensionalArrayDeepClone(int[][] arr) {
        int[][] clone = new int[arr.length][];
        for (int i = 0; i < arr.length; i++) {
            clone[i] = new int[arr[i].length];
            for (int j = 0; j < arr[i].length; j++) {
                clone[i][j] = arr[i][j];
            }
        }
        System.out.println("Multi-dimensional array deep clone: ");
        System.out.println("arr == clone: " + (arr == clone));
        System.out.println("arr.equals(clone): " + arr.equals(clone));
        System.out.println("arr[0] == clone[0]: " + (arr[0] == clone[0]));
        System.out.println("arr[0][0] == clone[0][0]: " + (arr[0][0] == clone[0][0]));
    }

    // Custom method for array equality
    public static boolean customArrayEquals(int[] array1, int[] array2) {
        if (array1 == array2) {
            return true;
        }
        if (array1 == null || array2 == null || array1.length != array2.length) {
            return false;
        }

        // Custom array equality check
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }

        return true;
    }
}