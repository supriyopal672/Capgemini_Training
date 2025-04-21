package streamAPI;

import java.util.Arrays;
import java.util.List;

public class StringCounter {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Apple", "Banana", "Apricot", "Cherry", "Avocado");
        char startingLetter = 'A';
        
        long count = strings.stream()
            .filter(s -> !s.isEmpty() && s.charAt(0) == Character.toUpperCase(startingLetter))
            .count();
            
        System.out.println("Number of strings starting with '" + startingLetter + "': " + count);
    }
}
