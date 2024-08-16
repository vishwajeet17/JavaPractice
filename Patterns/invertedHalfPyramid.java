// Pattern: Inverted Half Pyramid

// ****
// ***
// **
// *

//Time Comp: O(n^2)



public class invertedHalfPyramid {
    public static void main(String[] args) {
        int n=4;
        //Outer Loop
        for (int i=n;i>0;i--){
            //inner Loop
            for (int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
