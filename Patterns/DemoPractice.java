import java.util.*;
import java.util.stream.*;
public class DemoPractice {

    class Student{
        int num;
        String str;
        public Student(int num, String str) {
            this.num = num;
            this.str = str;
        }


        
    }


    public static void main(String[] args) {
        
// // String is given
// // use hashmap to find not repeative char
//         String str = "geeksforgeeks";
//         int count=1;

//         Map<Character, Integer> nonRepetive = new HashMap<>(); 

//         for(int i = 0 ; i<str.length(); i++){
//             //check char is key in map or not, if not then create, if present then update value of that key
//             if(!nonRepetive.containsKey(str.charAt(i))){
//                 nonRepetive.put(str.charAt(i), count);
//             }
//             else{
//                 nonRepetive.put(str.charAt(i),nonRepetive.get(str.charAt(i))+1);
//             }
            
            
//         }

//         System.out.println(str);

//conevrt below list to Map usig java 8



      //  List<Student> personList = Arrays.asList( new Student(1, "Alice"), new Student(2, "Bob"), new Student(3, "Charlie") );

       // Map<Integer, String> convdertedMap = personList.stream();

    }
    
}
