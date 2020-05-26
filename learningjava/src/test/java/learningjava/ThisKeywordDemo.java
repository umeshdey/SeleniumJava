package learningjava;

public class ThisKeywordDemo {
	
	int x;
	
	public ThisKeywordDemo() {
//		System.out.println(this);
	}
	
	void doSomething() {
		System.out.println(this);
	}
	
	

	public static void main(String[] args) {
		
		ThisKeywordDemo obj = new ThisKeywordDemo();
		
		obj.doSomething();
		
		ThisKeywordDemo obj1 = new ThisKeywordDemo();
		
		obj1.doSomething();
		
//		new ThisKeywordDemo();
		

	}

}
