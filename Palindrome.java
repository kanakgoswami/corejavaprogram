import java.util.stream.IntStream;

public class Palindrome {
    public static void main(String[] args) {
        String str = "Radar",
                reverseStr = "";
        for (int i = (str.length() - 1); i >= 0; --i) {
            reverseStr = reverseStr + str.charAt(i);
        }
        if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
            System.out.println(str + " is a Palindrome String.");
        } else {
            System.out.println(str + " is not a Palindrome String.");
        }
        /////////////////////////////////////////////////////////////////////////////////////////
        // Check if 'radar' is Palindrome
        System.out.println("Is radar a Palindrome? - " + isPalindrome("radar")); // true
        // Check if 'apple' is Palindrome
        System.out.println("Is apple a Palindrome? - " + isPalindrome("apple")); // false
        ///////////////////////////////////////////////////////////////////////////////////////////
        String original = "kanak"; // Objects of String class
        StringBuffer reverse;
        reverse = new StringBuffer(original);
        reverse.reverse();
        System.out.println(reverse);
        if (original.equals(reverse.toString()))
            System.out.println("The string is a palindrome.");
        else
            System.out.println("The string isn't a palindrome.");
    }

    public static boolean isPalindrome(String originalString) {

        String tempString = originalString.replaceAll("\\s+", "").toLowerCase();

        return IntStream.range(0, tempString.length() / 2)
                .noneMatch(i -> tempString.charAt(i) != tempString.charAt(tempString.length() - i - 1));

    }
}
