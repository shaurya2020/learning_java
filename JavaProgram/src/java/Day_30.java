package java;

public class Day_30 {

	public static void main(String[] args) {

//		detect the spaces and tripal spaces
		
		String name = "Ayush is  my   name, and   i  have a grate job";
		System.out.println(name);
		
		System.out.println(name.indexOf("  "));
		System.out.println(name.indexOf("   "));
	}

}
