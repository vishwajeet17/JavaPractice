import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamExample {
    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> numbers = Arrays.asList(3, 9, 2, 7, 5, 1, 4, 6, 8);

        // Filter: Find all even numbers
        List<Integer> evenNumbers = numbers.stream()
                                           .filter(n -> n % 2 == 0)
                                           .collect(Collectors.toList());
        System.out.println("Even Numbers: " + evenNumbers);

        // Map: Square each number
        List<Integer> squaredNumbers = numbers.stream()
                                              .map(n -> n * n)
                                              .collect(Collectors.toList());
        System.out.println("Squared Numbers: " + squaredNumbers);

        // Sorted: Sort the numbers
        List<Integer> sortedNumbers = numbers.stream()
                                             .sorted()
                                             .collect(Collectors.toList());
        System.out.println("Sorted Numbers: " + sortedNumbers);

        // Reduce: Sum all numbers
        int sum = numbers.stream()
                         .reduce(0, Integer::sum);
        System.out.println("Sum of Numbers: " + sum);

        // Count: Count how many numbers are greater than 5
        long countGreaterThanFive = numbers.stream()
                                           .filter(n -> n > 5)
                                           .count();
        System.out.println("Count of Numbers > 5: " + countGreaterThanFive);

        // FindFirst: Find the first number greater than 4
        OptionalInt firstGreaterThanFour = numbers.stream()
                                                  .filter(n -> n > 4)
                                                  .mapToInt(n -> n)
                                                  .findFirst();
        System.out.println("First Number > 4: " + firstGreaterThanFour.orElse(-1));

        // Parallel Stream: Find the maximum number using parallel processing
        OptionalInt maxNumber = numbers.parallelStream()
                                       .mapToInt(n -> n)
                                       .max();
        System.out.println("Maximum Number: " + maxNumber.orElse(-1));

        // Collectors: Convert the list to a comma-separated string
        String commaSeparatedNumbers = numbers.stream()
                                              .map(String::valueOf)
                                              .collect(Collectors.joining(", "));
        System.out.println("Comma-Separated Numbers: " + commaSeparatedNumbers);

        // IntStream.range: Create a range of numbers and find the average
        double average = IntStream.range(1, 10)
                                  .average()
                                  .orElse(0);
        System.out.println("Average of Range 1-9: " + average);
    }
}
