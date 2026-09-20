package Java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Day_4 {

//	Sorting a List/Array list using Collections.sort()
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> names = new ArrayList<>();
	names.add("Navya");
	names.add("karan");
	names.add("Vipul");
	names.add("harendra");
	names.add("arti");
	names.add("unnati");
	
	Collections.sort(names);
	System.out.println("Shorted Names: " + names);
	names.sort(Collections.reverseOrder());
	System.out.println("Reverse shorted Names: " + names);
	}

}
