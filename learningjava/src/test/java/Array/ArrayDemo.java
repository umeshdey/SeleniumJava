package Array;

public class ArrayDemo {
	
	public static void main(String[] args) {
		
//		int arr[] = new int[5];
//		
//		arr[0] = 20;
//		arr[1] = 30;
//		
//		System.out.println(arr[1]);
		
		
		int arr[] = {10, 20, 30, 40, 50};
		
		try {
			
			System.out.println(arr[5]);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Please access within scope of array");
		}
		
//		System.out.println(arr[0]);
		
//		for (int i = 0; i < arr.length; i++) {
//			
//			System.out.println(arr[i]);
//		}
		
		for(int element : arr) {
			System.out.println(element);
		}
	}

}
