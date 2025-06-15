package Day2;

public class nestedIfElseStatement {
	public static void main(String[]agrs) {
		
		int a=10; int b=15;int c=20;
		if(a>b) {
			if(a>c)
				System.out.println("The greatest number is :"+a);
			else
				System.out.println("The greatest number is:"+c);
		}else {
			if(c>b)
				System.out.println("The greatest number is:"+c);
			else
				System.out.println("The greatest number is :"+b);
		}
	}

}
