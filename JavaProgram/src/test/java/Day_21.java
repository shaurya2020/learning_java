package test.java;

public class Day_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Ayush";
		String rev =" ";
		
		for(int i=0; i<name.length(); i++)
		{
			rev = name.charAt(i)+rev;
			
		}
		System.out.println("Reverce String :" + rev);
	
		
		


	}

}
