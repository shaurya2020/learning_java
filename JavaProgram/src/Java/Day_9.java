package Java;

import java.util.Scanner;

public class Day_9 {

	//swap two number without using 3rd veriable
	
	public static void main(String[] args) {

//		System.out.println("Enter Value of x&y");
//		Scanner sc = new Scanner(System.in);
//		int x = sc.nextInt();
//		int y = sc.nextInt();

		int x= 100;
		int y=30;
		
		System.out.println("before swap:" +x+" " +y);
		x= x+y;
		y=x-y;
		x=x-y;
		System.out.println("After swap:"+x+" "+y);
//		sc.close();
	}

}
