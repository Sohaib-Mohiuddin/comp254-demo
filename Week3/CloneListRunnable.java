package Week3;

public class CloneListRunnable {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        CloneArray.shallowCloneArray(arr);
        CloneArray.deepCloneArray(arr);
    }
}
