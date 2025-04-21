package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class MinMaxFinder {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 9, 1, 7, 4);
        
        OptionalInt max = numbers.stream()
            .mapToInt(Integer::intValue)
            .max();
            
        OptionalInt min = numbers.stream()
            .mapToInt(Integer::intValue)
            .min();
            
        if (max.isPresent() && min.isPresent()) {
            System.out.println("Maximum value: " + max.getAsInt());
            System.out.println("Minimum value: " + min.getAsInt());
        } else {
            System.out.println("List is empty");
        }
    }
}
