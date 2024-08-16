// Pattern: Inverted Half Pyramid with Numbers

// 1234
// 123
// 12
// 1

//Time Comp: O(n^2)



public class InvertedHalfPyramidWithNumbers {
    public static void main(String[] args) {
        int n = 4;
        // Outer loop
        for (int i = n; i >= 0; i--) {
            // inner loop
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
