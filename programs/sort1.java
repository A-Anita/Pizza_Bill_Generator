import java.util.Arrays;
import java.util.Collections;

public class sort1 {
    public static void main(String[] args) {
        // Define an array of Integer type
        Integer[] array = new Integer[]{90, 23, 5, 109, 12, 22, 67, 34};
        
        // Invoke sort() method of the Arrays class with reverseOrder() to sort in descending order
        Arrays.sort(array, Collections.reverseOrder());
        
        System.out.println("Elements of array sorted in descending order:");
        
        // Print array using the enhanced for loop
        for (int num : array) {
            System.out.println(num);
        }
    }
}
