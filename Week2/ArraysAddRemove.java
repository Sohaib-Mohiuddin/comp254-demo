import java.util.Arrays;

public class ArraysAddRemove {
    public static void removeElement() {
        int[] array = {1, 2, 3, 4, 5};
        int[] newArray = new int[array.length - 1];
        int valueToRemove = 2;
        int indexToRemove = -1;

        // Find the index of the value to remove
        for (int i = 0; i < array.length; i++) {
            // If the value is found, store the index and break
            if (array[i] == valueToRemove) {
                indexToRemove = i;
                break;
            }
        }

        // If the value is found, copy the array to the new array
        if (indexToRemove != -1) {
            for (int i = 0, j = 0; i < array.length; i++) {
                // Skip the value to remove
                if (i != indexToRemove) {
                    // Copy the value to the new array
                    // Increment the new array index j
                    newArray[j++] = array[i];
                }
            }
        }

        System.out.println(Arrays.toString(newArray));
    }

    public static void main(String[] args) {
        removeElement();
    }
}
