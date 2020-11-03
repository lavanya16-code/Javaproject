package oct30;
import java.io.BufferedReader;
import java.io.*;
public class FileWriterDemo {
	  public static void main(String[] args) throws IOException {
		    BufferedWriter bw=null;
		  try {
	          FileWriter fw = new FileWriter("out.txt");  
	   bw = new BufferedWriter(fw);  
	    bw.write("too much code");  
	  
	    } catch(EOFException e) {
	      System.err.println(e);
	    }
	   finally
	   {
		   bw.close();   
		   
	   }
	  }
	}

