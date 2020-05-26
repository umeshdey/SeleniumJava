package learningjava;

public class NonStaticMembersDemo {

	public NonStaticMembersDemo() {
		System.out.println("Inside the constructor");
	}
	
	
	{
		System.out.println("Inside the non-static block");
	}
	
	static {
		System.out.println("Inside static method");
	}
	
	void doSomething() {
		System.out.println("Inside do something");
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("Inside main method");
		
		NonStaticMembersDemo obj = new NonStaticMembersDemo();
		
		NonStaticMembersDemo obj1 = new NonStaticMembersDemo();
		
		obj.doSomething();

	}

}
