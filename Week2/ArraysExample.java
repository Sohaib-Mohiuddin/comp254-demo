public class ArraysExample {
    public static void main(String[] args) {
        Integer[] numbers = new Integer[5];
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        System.out.println("The value of the first element is: " + numbers[0]);
        System.out.println("The value of the second element is: " + numbers[1]);
        System.out.println("The value of the third element is: " + numbers[2]);
        System.out.println("The value of the fourth element is: " + numbers[3]);
        System.out.println("The value of the fifth element is: " + numbers[4]);

        System.out.println("\nNow I will use a for loop to print all the numbers in the array\n");

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("The value of the element " + i + " is: " + numbers[i]);
        }
    }
}
