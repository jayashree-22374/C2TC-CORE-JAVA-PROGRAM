package exceptionalHandling;

public class ExceptionPractice {
	
		public static void main(String[]args) {
			
			int a=10,b=0;
			int c=0;
			try {
				int arr[]= {1,2,3,4};
				System.out.println(arr[3]);
				c=a/b;
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Over flow of array as Occured");
			}
			catch(ArithmeticException e) {
				System.err.println("Maths Error");
			}
			catch(Exception e){
				System.err.println("Error occured");
				
			}
			finally {
				System.out.println("It will always executes");
			}
			System.out.println(c);
			System.out.println("Welcome to banking!!!");
		
		}	
			
					
					
			
		
}
