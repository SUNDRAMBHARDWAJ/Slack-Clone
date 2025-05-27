public class index {
    public static void main(String[] args) {
        // Example string to reverse
        String originalString = "Hello, World!";
        
        // Method 1: Using StringBuilder
        String reversed1 = reverseUsingStringBuilder(originalString);
        System.out.println("Original String: " + originalString);
        System.out.println("Reversed using StringBuilder: " + reversed1);
        
        // Method 2: Using character array
        String reversed2 = reverseUsingCharArray(originalString);
        System.out.println("Reversed using char array: " + reversed2);
        
        // Method 3: Using recursion
        String reversed3 = reverseUsingRecursion(originalString);
        System.out.println("Reversed using recursion: " + reversed3);
    }
    
    // Method 1: Using StringBuilder
    public static String reverseUsingStringBuilder(String str) {
        return new StringBuilder(str).reverse().toString();
    }
    
    // Method 2: Using character array
    public static String reverseUsingCharArray(String str) {
        char[] charArray = str.toCharArray();
        int left = 0;
        int right = charArray.length - 1;
        
        while (left < right) {
            // Swap characters
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            
            // Move pointers
            left++;
            right--;
        }
        
        return new String(charArray);
    }
    
    // Method 3: Using recursion
    public static String reverseUsingRecursion(String str) {
        if (str == null || str.length() <= 1) {
            return str;
        }
        return reverseUsingRecursion(str.substring(1)) + str.charAt(0);
    }
} 