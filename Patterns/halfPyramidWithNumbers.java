// Pattern: Half Pyramid with Numbers

// 1
// 12
// 123
// 1234

//Time Comp: O(n^2)

package JavaPractice.Patterns;

public class halfPyramidWithNumbers {
    public static void main(String[] args) {
        int n = 4;
        //Outer loop
        for (int i = 1; i <= n; i++) {
            //Inner loop
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
