package learningjava;

public class StaticMethodsDemo {


	static void method2() {
		System.out.println("Inside method2");
	}


	static void method1() {
		System.out.println("Inside method1");
		StaticMethodsDemo.method2();
		System.out.println("Back in method1");
	}

	public static void main(String[] args) {

		System.out.println("Inside main method");

		StaticMethodsDemo.method1();

		System.out.println("Back in main method");

	}

}
