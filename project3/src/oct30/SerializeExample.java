package oct30;
import java.io.*; 
public class SerializeExample { 
	public static void main(String[] args) { 
	Student e = new Student(); 
	e.name = "Kapil k Singh"; 
	e.address = "E-247,Beta-1,Chennai"; 
	e.rollno ="545673"; 
	e.roomNo = 111; 
	try { 
	FileOutputStream fileOut = new FileOutputStream("student.dat"); 
	ObjectOutputStream out = new ObjectOutputStream(fileOut); 
	out.writeObject(e); 

	out.close(); 

	//fileOut.close(); 
	System.out .println("Object is serialized & stored in 'student.dat'"); 
	} catch (IOException ie) { 
	ie.printStackTrace(); 
	} 
	} 
	}

