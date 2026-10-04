package test.java;

import java.util.Scanner;

public class Day_7 {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int mark = scn.nextInt();
		
	/*	if (mark>=110) {
			System.out.println("you passed.");
		}
			else {
				System.out.println("you failed");
			}
	*/
//		System.out.println("===============");
		
		
		if (mark>=90) {
			System.out.println("you have exellent : Grade A");
		}
		else if(mark>=80) {
			System.out.println("you have good : Grade B ");
		}
		else if(mark>=70){
			System.out.println("you have improve it : Grade C");
		}
		else {
			System.out.println("you want : Gread D");
		}
	
		scn.close();
		}
	}

