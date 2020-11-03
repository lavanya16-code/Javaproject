package day7;
import java.io.*;
class inputdemo1 {

	public static void main(String[] args) //throws Exception
	{
		try
		{ 
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter String");
			String s=br.readLine();
			System.out.println("Enter no");
			int n=Integer.parseInt(br.readLine());
            System.out.println("Enter no");
            int n1=Integer.parseInt(br.readLine());
            System.out.println(s+" "+n+" "+n1);
         
}
		catch(Exception e) {
            System.out.println("IO Exception");
			
		}
	}
		


	}
