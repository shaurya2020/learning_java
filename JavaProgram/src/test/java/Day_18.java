package test.java;

import java.util.Scanner;

public class Day_18 {

	public static void main(String[] args) {

		Scanner mk = new Scanner(System.in);
		System.out.println("Enter your Hindi markes : ");
		int hindi = mk.nextInt();
		System.out.println("Enter your Math markes : ");
		int math = mk.nextInt();
		System.out.println("Enter your English markes : ");
		int english = mk.nextInt();
		System.out.println("Enter your Science markes : ");
		int science = mk.nextInt();
		System.out.println("Enter your Art markes : ");
		int art = mk.nextInt();
		
		int sum = (hindi+math+english+science+art);
		System.out.println("Total Markes :" +sum);
		
		float total_mark = (sum/500.0f)*100; 
		System.out.println("Total Percentage :" +total_mark);
		
		mk.close();
		
	}

}
