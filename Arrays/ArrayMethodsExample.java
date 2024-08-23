import java.util.Arrays;

public class ArrayMethodsExample {

    public static void main(String[] args) {
        // Basic Array Initialization
        int[] numbers = {5, 3, 8, 1, 2};
        System.out.println("Original Array: " + Arrays.toString(numbers));
        
        // 1. Sorting
        Arrays.sort(numbers);
        System.out.println("Sorted Array: " + Arrays.toString(numbers));
        
        // 2. Searching
        int index = Arrays.binarySearch(numbers, 3);
        System.out.println("Index of 3: " + index);
        
        // 3. Filling
        int[] filledArray = new int[5];
        Arrays.fill(filledArray, 10);
        System.out.println("Filled Array: " + Arrays.toString(filledArray));
        
        // 4. Copying
        int[] copiedArray = Arrays.copyOf(numbers, 7);
        System.out.println("Copied Array (with padding): " + Arrays.toString(copiedArray));
        
        int[] rangeCopiedArray = Arrays.copyOfRange(numbers, 1, 4);
        System.out.println("Range Copied Array: " + Arrays.toString(rangeCopiedArray));
        
        // 5. Comparing
        int[] anotherArray = {1, 2, 3, 4, 5};
        boolean isEqual = Arrays.equals(numbers, anotherArray);
        System.out.println("Arrays are equal: " + isEqual);
        
        // 6. Converting to String
        String arrayString = Arrays.toString(numbers);
        System.out.println("Array as String: " + arrayString);
        
        // 7. Parallel Operations
        int[] parallelArray = {5, 3, 8, 1, 2};
        Arrays.parallelSort(parallelArray);
        System.out.println("Parallel Sorted Array: " + Arrays.toString(parallelArray));
        
        int[] prefixArray = {1, 2, 3};
        Arrays.parallelPrefix(prefixArray, (x, y) -> x + y);
        System.out.println("Parallel Prefix Array: " + Arrays.toString(prefixArray));
    }
}
