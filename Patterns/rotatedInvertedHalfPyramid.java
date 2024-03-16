// Pattern: Rotated Inverted Half Pyramid

//    *
//   **
//  ***
// ****

//Time Comp: O(n^2)

package JavaPractice.Patterns;

public class rotatedInvertedHalfPyramid {
    public static void main(String[] args) {
        int n=4;
        //outer loop
        for(int i=n;i>=0;i--){
            //Inner loop
            for(int j=0;j<n;j++){
                if(j>=i){
                    System.out.print('*');
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
