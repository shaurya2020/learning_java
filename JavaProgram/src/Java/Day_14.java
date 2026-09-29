package Java;

//outside the class object is created
class student {
	int id =200;
	String name= "Ayuu";
}

public class Day_14 {
	public static void main(String[] args) {

		student s1 = new student();

		int ii = s1.id;
		String ss =s1.name;
		System.out.println(ii);
		System.out.println(ss);
	}
}
