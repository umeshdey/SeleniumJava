package polymorphism;

public class CompileTimeBinding {
	
	void add(int a, int b) {
		int result = a+b;
		System.out.println("Result is: "+ result);
	}
	
	void add(float a, float b) {
		float result = a+b;
		System.out.println("Result is: " + result);
	}
	
	void add(int a, int b, int c) {
		int result = a+b+c;
		System.out.println("Result is: "+ result);
	}

	public static void main(String[] args) {
		
		CompileTimeBinding obj = new CompileTimeBinding();
		
		obj.add(10, 20, 30);
		obj.add(30, 70);
		obj.add(20.5f,  50.5f);

	}

}
