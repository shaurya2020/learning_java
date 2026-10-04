package java;

public class Day_5 {
	public static String reverse(String str) {
		
//		reverse string 
		
//		if (str == null) {
//			return null;
//		}

		StringBuilder reversed = new StringBuilder();
		for (int i = str.length() - 1; i >= 0; i--) {
			reversed.append(str.charAt(i));
		}
		return reversed.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String original = "Automation";
		System.out.println("Original:" + original);
		System.out.println("Reversed: " + reverse(original));
	}

}
