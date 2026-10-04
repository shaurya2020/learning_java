package java;

class Test {
//	multilevel inheritance
	public void java() {
		System.out.println("Inside Room: B4");
	}
}

class Sql extends Test {
	public void table() {
		System.out.println("inside Room : B3");
	}
}

class Api extends Sql {
	public void post() {
		System.out.println("inside Room: B2");
	}
}

public class Day_11a {
	public static void main(String[] args) {

		Api app = new Api();
		app.java();
		app.post();
		app.table();

	}
}
