package oct30;
import java.io.FileOutputStream;
import java.io.*;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b[]=new byte[100];
		try {
			System.in.read(b);
			FileOutputStream fout=new FileOutputStream ("text3.txt");
			fout.write(b);
			fout.close();
		}
		catch(IOException e) 
		{
			e.printStackTrace();
		}

	}

}
