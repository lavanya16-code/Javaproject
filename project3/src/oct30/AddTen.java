package oct30;
import java.util.Scanner;
public class AddTen {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner scan=new Scanner (System.in);
			System.out.println("Enter to add num");
			Add obj=(int a,int b)->System.out.println(a+b);
			obj.add(scan.nextInt(),scan.nextInt());
		
			

		}

	}
