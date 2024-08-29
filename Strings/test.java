import java.util.*;
import java.util.stream.*;

public class test {

// windows functio in sql - check it(performance over rownum)
// byteArray / chunks(iterative in nature) - checks them




//count of each char, output to be sorted, if char id higher on based on repeation, if same legth then alphabatcle order
    //"vishwajeet"
    //"aabbcccdddd" = d4 c3 a2 b2 - string

    public static void main(String[] args) {
        
        String str = "aabbcccdddd";

        Map<Character, Integer> strMap = new HashMap<>();

        for(int i =0; i<str.length();i++){
            if(!strMap.containsKey(str.charAt(i))){
                strMap.put(str.charAt(i),1);
            }
            else{
                strMap.put(str.charAt(i),strMap.get(str.charAt(i))+1);
            }
        }

        strMap = strMap.stream().sorted(Comparator.comparing(()->)).collect(Collectors.);
        String outputString = new String();

        System.out.println(strMap);
        


    }

}
