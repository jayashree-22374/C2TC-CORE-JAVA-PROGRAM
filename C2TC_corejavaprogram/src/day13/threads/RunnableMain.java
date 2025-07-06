package day13.threads;

public class RunnableMain {
	
	public static void main(String[] args) {
		UsingRunnable obj=new UsingRunnable(5,10,"hello coders..");
		Runnable runnable=new Runnable() {
			
			public void run(){
					try
					{
						for(int i=1;i<=4;i++)
						{
							System.out.println("Child thread task3:"+i);
							Thread.sleep(1500);
						}
					}
					catch(InterruptedException e)
					{
						System.out.println("Error");
					}
			}
			
		};
		Thread thread=new Thread(runnable);
		thread.start();
	}
	
}


   
