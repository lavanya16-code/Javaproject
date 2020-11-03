package day7;
class MyNegativeAgeException extends RuntimeException {
	public String toString() {
		return "Age cannot be negative";
	}
}

public class Custom1 {
	static int getAge() {
		return -10;
	}
	public static void main(String[] args) {
		// throws Negative
		int age=getAge();
		try
		{
			if(age<0)
				throw new MyNegativeAgeException();
			else
				System.out.println("Age entered is" +age);
				
		}
		catch(MyNegativeAgeException e)
		{
			System.out.println(e);
		}

	}

}
