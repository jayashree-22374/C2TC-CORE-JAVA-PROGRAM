package day13.threads;

public class UsingRunnable implements Runnable{
	
	Thread thread;
	int low, high;
	String msg;
	public UsingRunnable( int low, int high, String msg) {
		super();
		
		this.low = low;
		this.high = high;
		this.msg = msg;
		thread =new Thread(this,"child thread");
		thread.start();                          // when we call the start method the run method is automatically called
	}
	@Override
	public void run()
	{
		for(int i=low;i<=high;i++)
		{
			try
			{
				Thread.sleep(1000);    // 1000=1sec
			}
			catch(InterruptedException e)
			{
				System.out.println("Error:"+e.getMessage());
			}
			System.out.println(msg+""+i);
			
		}
	}

}