package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringSorter {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Banana", "Apple", "Cherry", "Date");
        
        // Ascending order
        List<String> ascending = strings.stream()
            .sorted()
            .collect(Collectors.toList());
        System.out.println("Ascending order: " + ascending);
        
        // Descending order
        List<String> descending = strings.stream()
            .sorted((s1, s2) -> s2.compareTo(s1))
            .collect(Collectors.toList());
        System.out.println("Descending order: " + descending);
    }
}
