public class ReverseStrings {

    public static String reverseString(String s) {
        String resultString = new String();
        for (int i = s.length() - 1; i >= 0; i--) {
            resultString += s.charAt(i);
        }
        return resultString;
    }

    public static void main(String[] args) {
        String inputString = "vishwajeet";
        String outputString = reverseString(inputString);
        System.out.println(outputString);
    }

}
