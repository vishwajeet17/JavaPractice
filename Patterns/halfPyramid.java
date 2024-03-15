// Pattern: Half Pyramid

// *
// **
// ***
// ****

//Time Comp: O(n^2)

package JavaPractice.Patterns;

public class halfPyramid {
    public static void main(String[] args) {
        int n=4;
        //OuterLoop
        for (int i=0;i<n;i++){
            //InnerLoop
            for (int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
