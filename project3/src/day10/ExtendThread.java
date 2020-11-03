package day10;
class NewThread extends Thread{
	public void run()
{
		try {
			for(int i=5;i>0;i--)
			{
				System.out.println("Child Thread: " +i);
				Thread.sleep(600);
			}
		}catch (InterruptedException e) {
			System.out.println("Child interrupted.");
		}
		System.out.println("Exiting child thread.");
}
	
}

public class ExtendThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NewThread t=new NewThread();// create a new thread
		t.setName("Demo Thread");
		System.out.println("Child Thread: " +t);
		t.start();
	try {
		for(int i=5;i>0;i--)
		{
			System.out.println("Child Thread: " +i);
			Thread.sleep(600);
		}
	}catch (InterruptedException e) {
		System.out.println("Main thread interrupted.");
	}
	System.out.println("Main thread exiting.");
}

}
