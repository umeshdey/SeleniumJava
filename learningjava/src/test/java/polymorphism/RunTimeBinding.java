package polymorphism;

public class RunTimeBinding {

	public static void main(String[] args) {
		
		AppleLapTop m1 = new MacBookPro();
		AppleLapTop m2 = new MacBookAir();
		
		m1.start();

	}

}
