package test.java;

public class Day_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hello ayuu java programming is very easy";

		String[] words = str.split(" ");
		StringBuilder result = new StringBuilder();

		for (String word : words) {
		    result.append(Character.toUpperCase(word.charAt(0)))
		          .append(word.substring(1))
		          .append(" ");
		}

		System.out.println(result.toString().trim());
	}

}
