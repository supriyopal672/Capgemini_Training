package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SecondMinMax {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 9, 1, 7, 4, 9, 1);
        
        // Second smallest
        Integer secondSmallest = numbers.stream()
            .distinct()
            .sorted()
            .skip(1)
            .findFirst()
            .orElse(null);
            
        // Second largest
        Integer secondLargest = numbers.stream()
            .distinct()
            .sorted((a, b) -> b.compareTo(a))
            .skip(1)
            .findFirst()
            .orElse(null);
            
        System.out.println("Second smallest: " + secondSmallest);
        System.out.println("Second largest: " + secondLargest);
    }
}
