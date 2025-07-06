package exceptionalHandling;

public class ExceptionExample {
	public static void main(String[]args) {
		try {
			int a[]= {6,7,8,4};
			System.out.println(a[5]); // raising exception object
			
		}
		catch(ArrayIndexOutOfBoundsException ae) {
			System.err.println("Exception occured:"+ae.getMessage());
			
		}
		System.out.println("Next Line");
	}

}

