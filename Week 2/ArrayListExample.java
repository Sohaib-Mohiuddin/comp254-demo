import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        // Use List to ensure we can use any collection such as ArrayList, LinkedList
        List<String> car = new ArrayList<>();

        // Add some cars to the ArrayList
        car.add("Honda");
        car.add("Toyota");

        System.out.println("The Cars List Contains: " + car);

        // Before removing the second car from the ArrayList
        // We will use for-each loop to iterate through the ArrayList
        System.out.print("Using for-each in, The Cars List Contains: ");
        for (String c : car) {
            System.out.print(c + " ");
        }
        System.out.println("");
        System.out.println("----------------------------------");

        System.out.println("Now we will use forEach method");
        car.forEach(d -> System.out.println(d + " "));
        car.forEach(System.out::println);

        System.out.println("----------------------------------");

        // Remove the second car from the ArrayList
        car.remove(car.indexOf("Toyota"));

        System.out.println("The Cars List NOW Contains: " + car);
    }
}
