package Java;

public class Day_24 {
			   public static boolean isPalindrome(String str) {
			       String reversed = new StringBuilder(str).reverse().toString();
			       return str.equalsIgnoreCase(reversed);
			   }
			   public static void main(String[] args) {
			       String input = "Radar";
			       if (isPalindrome(input)) {
			           System.out.println(input + " is a palindrome.");
			       } else {
			           System.out.println(input + " is not a palindrome.");
			       }
			 
	}

}
