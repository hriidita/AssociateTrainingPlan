package tryCatch;

public class TryCatchExample {

	public static void main(String[] args) {
		try {
			int[] a = {1, 2, 3, 4, 5, 6};
		System.out.println(a[8]);
		} catch (Exception e) {
			System.out.println("Enter a valid number");
		}
		
	}

}
