package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class AverageCalculator {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        
        OptionalDouble average = numbers.stream()
            .mapToInt(Integer::intValue)
            .average();
            
        if (average.isPresent()) {
            System.out.println("Average: " + average.getAsDouble());
        } else {
            System.out.println("List is empty");
        }
    }
}