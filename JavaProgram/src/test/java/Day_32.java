package test.java;

public class Day_32 {

	public static void main(String[] args) {

		int num = 125;
		int rem = 0;
		int rev = 0;
		
		while(num>0) {
			rem=num%10;
			rev=rev*10;
			
		}
		System.out.println(rev);
	}

}
