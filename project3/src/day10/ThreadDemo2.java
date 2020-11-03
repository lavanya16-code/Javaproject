package day10;
	class NewThread implements Runnable{
		int i;
		public void run()
	{
			try {
				for(int i=5;i>0;i--)
				{
					System.out.println("Child Thread: " +i);
					Thread.sleep(600);
				}
		
			}
			catch (InterruptedException e) {
				System.out.println("Exception in Child thread");
			}
			System.out.println("child exiting");
	}
		
	}

	public class ThreadDemo2{

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			NewThread obj =new NewThread();// create a new thread
			Thread t=new Thread (obj);
			t.start();
		try {
			for(int i=5;i>0;i--)
			{
				System.out.println("Main Thread: " +i);
				Thread.sleep(600);
				t.join();
			}
		}
		catch (InterruptedException e) {
			System.out.println("Main thread interrupted.");
		}
		System.out.println("Main thread exiting.");
	}

	}
