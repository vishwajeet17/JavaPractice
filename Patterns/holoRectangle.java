// Pattern: 5x4 holo Rectangle

// *****
// *   *
// *   *
// *****

//Time Comp: O(nm)




public class holoRectangle {
    public static void main(String[] args) {
        int n=4; //row
        int m=5; //column

        //OuterLoop
        for(int i=0;i<n;i++){
            //InnerLoop
            for(int j=0;j<m;j++){
                if(i==0 || i==n-1 || j==0 || j==m-1){
                System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
