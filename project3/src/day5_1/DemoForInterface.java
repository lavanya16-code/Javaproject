package day5_1;
import day5.*;

public class DemoForInterface implements I{
	public void add()
	{
		System.out.println("in add method of interface");
	}
	public void show()
	{
		System.out.println("in overridden show");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoForInterface obj=new DemoForInterface();
		obj.add();
		obj.show();
		I.show1();
	}
}
		
		

	


