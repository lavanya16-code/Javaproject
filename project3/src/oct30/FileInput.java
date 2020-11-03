package oct30;
import java.io.FileInputStream;
import java.io.*;
public class FileInput {
	void readFile()throws IOException
	{
		FileInputStream  f=null;
		byte b[]=new byte[150];
		try
		{
			f=new FileInputStream("text3.txt");
			f.read(b);
			String str=new String(b);
			System.out.println(str.trim());
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			f.close();
		}
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
				FileInput fileInput=new FileInput();
				fileInput.readFile();
	}
}
