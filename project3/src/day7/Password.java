package day7;
import java.util.Scanner;
class MyNegativeAgeException extends Exception {
	public String toString() {
		return "invalid password";
	}
}

public class Password {
	static String pwd() {
		return "lavanya";
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String password=pwd();
		int a=0;
		for(int i=0;i<3;i++) {
			System.out.println("Enter password");
			Scanner scan=new Scanner(System.in);
			String enter=scan.next();
			if(enter.equals(password)) {
				a=1;
				break;
			}
			System.out.println("flag:"+(i+1));
			}
		try {
			if(a==0)
				throw new MyNewExceptions();
			else
				System.out.println("correct password" +pwd);
		}
		catch(MyNewExceptions e)
		{
			System.out.println(e);
		}

	}


}

	


