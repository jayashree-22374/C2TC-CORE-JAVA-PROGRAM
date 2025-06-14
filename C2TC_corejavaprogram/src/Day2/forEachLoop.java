package Day2;

public class forEachLoop {

	public static void main(String[]args) {
		
		int a[]= {5,10,15,20,25};
		for(int i:a)
		{
			System.out.println("The integer array are:"+i);
		}
		
		char ch[]= {'J','A','Y','A','S','H','R','E','E'};
		for(char A:ch)
		{
			System.out.println("The characters are:"+A);
		}
		
		String s1[]= {"This","is","Java","Language"};
		for(String s:s1)
		{
			System.out.println("The strings are:"+s);
		}
			
	}

}



