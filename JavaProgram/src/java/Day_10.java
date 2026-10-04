package java;

public class Day_10 {
	public static void main(String[] args) {
		
//		using StringBuilder.reverce
	/*
		String s = "Ayush";
		
		StringBuilder res = new StringBuilder();
		res.append(s);
		res.reverse();
		System.out.println(" Reverse : " + res);
		
		
	*/
		
		
		String name = "Ayush";
		String rev =" ";
		
		for(int i=0; i<name.length(); i++)
		{
			rev = name.charAt(i)+rev;
			
		}
		System.out.println("Reverce String :" + rev);
	
		
		
	}

}


