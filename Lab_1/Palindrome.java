package Lab_1;

/**
 * Class checks if word is a palidrome
 */
public class Palindrome {
    /**
     * Main method
     * 
     * @param args String array
     */
    public static void main(String[] args) {
        for (String s : args) {
            System.out.println(isPalindrome(s));
        }
    }

    /**
     * Reverses string
     * 
     * @param str String
     * @return String
     */
    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }

    /**
     * Checks if word is a palindrome
     * 
     * @param str String
     * @return boolean
     */
    public static boolean isPalindrome(String str) {
        return str.equals(reverseString(str));
    }
}