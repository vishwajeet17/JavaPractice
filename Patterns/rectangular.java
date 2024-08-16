// Pattern: 5x4 Rectangle

// *****
// *****
// *****
// *****

//Time Comp: O(nm)



public class rectangular {
    public static void main(String args[]){
        int n=4; //row
        int m=5; //column

        //Outer loop
        for(int i=0;i<n;i++){
            //Inner loop
            for(int j=0;j<m;j++){
                System.out.print('*');
            }
            //next line
            System.out.println();
        }
    }
}
