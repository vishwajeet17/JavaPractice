// Pattern: 0-1 Tringle
// 1
// 0 1
// 1 0 1
// 0 1 0 1

//Time Comp: O(n^2)

package JavaPractice.Patterns;

public class zeroOneTringle {
    public static void main(String[] args) {
        int n=4;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
