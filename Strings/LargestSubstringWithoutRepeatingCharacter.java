import java.util.*;

public class LargestSubstringWithoutRepeatingCharacter {

    public static int solve(String s) { // bruteForce Solution = two pointers
        int maxCount = 0;
        int stringLength = s.length();
        for (int i = 0; i < stringLength; i++) {
            int subStringSize = 0;
            StringBuilder subString = new StringBuilder();
            for (int j = i; j < stringLength; j++) {
                if (subString.indexOf(String.valueOf(s.charAt(j))) == -1) {
                    subString.append(s.charAt(j));
                    subStringSize += 1;
                    System.out.println(subString);
                }
            }
            maxCount = Math.max(maxCount, subStringSize);
        }
        return maxCount;
    }

    // public static int solveWithSlidingWindow(String s){

    // int maxCount = 0;
    // Map<Character,Integer> subStringMap = new HashMap<>();
    // for(int i = 0; i<s.length();i++){
    // if(subStringMap.containsKey(s.charAt(i))){

    // break;
    // }
    // subStringMap.add(s.charAt(i));
    // System.out.println(subString);
    // }

    // return maxCount;
    // }
    public static int solveWith_indexof(String s) {

        int maxlength = 0;
        for (int right = 0, left = 0; right < s.length(); right++) {
            int firstIndex = s.indexOf(s.charAt(right), left); // explain this
            System.out.println(firstIndex);
            if (firstIndex != right) {
                left = firstIndex + 1;
            }
            maxlength = Math.max(maxlength, left - right + 1);
        }

        return maxlength;

    }

    public static void main(String[] args) {
        String inputString = "abcabcacbad";
        System.out.println(solve(inputString));
        // System.out.println(solveWithSlidingWindow(inputString));
        System.out.println(solveWith_indexof(inputString));

    }

}
