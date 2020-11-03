package day7;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int c[] =new int[2] ;
			System.exit(0);
			//c[0]=6/0;
			System.out.println(c[3]);
		}
		catch (ArithmeticException e)
		{
		   	System.out.println("cannot divide by zero");
		   	e.printStackTrace();
		}
		catch (ArrayIndexOutofBoundsException e)
		{
		   	System.out.println("Check the size of array");
		   	e.printStackTrace();
		}
		finally
		{
			System.out.println("final");
					}
	}

}
