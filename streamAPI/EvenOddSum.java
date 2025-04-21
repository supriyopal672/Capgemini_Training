package streamAPI;

import java.util.Arrays;
import java.util.List;

public class EvenOddSum {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
        int evenSum = numbers.stream()
            .filter(n -> n % 2 == 0)
            .mapToInt(Integer::intValue)
            .sum();
            
        int oddSum = numbers.stream()
            .filter(n -> n % 2 != 0)
            .mapToInt(Integer::intValue)
            .sum();
            
        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
    }
}
