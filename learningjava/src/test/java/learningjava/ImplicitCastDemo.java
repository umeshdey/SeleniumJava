package learningjava;

public class ImplicitCastDemo {

	public static void main(String[] args) {
		
		int i = 10;
		
		char c = 'a';
		
		long l;
		
		
		l = i;
		i = c;
		
		System.out.println(l);
		System.out.println(i);
//		c = (char)i;

	}

}
