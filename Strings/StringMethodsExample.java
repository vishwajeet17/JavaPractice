public class StringMethodsExample {

    public static void main(String[] args) {
        String str = "  Hello World!  ";
        
        // 1. Basic Methods
        System.out.println("Length: " + str.length());          // Length: 15
        System.out.println("Char at index 6: " + str.charAt(6)); // Char at index 6: W
        System.out.println("Substring from index 7: " + str.substring(7)); // Substring from index 7: orld!  
        System.out.println("Substring (1, 5): " + str.substring(1, 5));   // Substring (1, 5): Hell
        
        // 2. String Comparison
        String s1 = "Hello";
        String s2 = "hello";
        System.out.println("Equals: " + s1.equals("Hello"));               // Equals: true
        System.out.println("Equals Ignore Case: " + s1.equalsIgnoreCase(s2)); // Equals Ignore Case: true
        System.out.println("Compare To: " + s1.compareTo(s2));             // Compare To: -32

        // 3. Searching Strings
        System.out.println("Contains 'World': " + str.contains("World"));  // Contains 'World': true
        System.out.println("Index of 'W': " + str.indexOf('W'));           // Index of 'W': 8
        System.out.println("Last index of 'o': " + str.lastIndexOf('o'));  // Last index of 'o': 9
        
        // 4. String Modification
        System.out.println("To Upper Case: " + str.toUpperCase());         // To Upper Case:   HELLO WORLD!  
        System.out.println("To Lower Case: " + str.toLowerCase());         // To Lower Case:   hello world!  
        System.out.println("Trimmed String: " + str.trim());               // Trimmed String: Hello World!
        System.out.println("Replace 'l' with 'p': " + str.replace('l', 'p')); // Replace 'l' with 'p':  Heppo Worpd!  
        System.out.println("Replace 'World' with 'Java': " + str.replace("World", "Java")); // Replace 'World' with 'Java':   Hello Java!  
        
        // 5. String Splitting and Joining
        String[] parts = str.trim().split(" ");
        System.out.println("Split String: ");
        for (String part : parts) {
            System.out.println(part);  // Output: Hello, Java!
        }
        String joined = String.join("-", "2024", "08", "16");
        System.out.println("Joined String: " + joined); // Joined String: 2024-08-16
        
        // 6. Other Useful Methods
        System.out.println("Starts with 'He': " + str.trim().startsWith("He")); // Starts with 'He': true
        System.out.println("Ends with '!': " + str.trim().endsWith("!"));       // Ends with '!': true
        System.out.println("Is Empty: " + str.isEmpty());  // Is Empty: false
        System.out.println("String value of 123: " + String.valueOf(123)); // String value of 123: 123
        
        // Intern example
        String internedStr = str.trim().intern();
        System.out.println("Interned String: " + internedStr);  // Interned String: Hello World!
    }
}
