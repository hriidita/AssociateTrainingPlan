package tryCatch;

public class tryCatchExamle2 {

	public static void main(String[] args) {
		try {
			int[] a = null;
			System.out.println(a[2]);
		} 
		catch (Exception e) {
			System.out.println("This array is null");
		}
	}

}
