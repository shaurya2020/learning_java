package test.java;

import java.util.Scanner;

public class D23_rev_num {

//	resverse integer
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int rem = 0;
		int rev = 0;
//		System.out.println(num);
		
//		loop
		
		while(num>0) {
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		sc.close();
		System.out.println(rev);
	}

}
