package day9;
import java.util.HashSet;
public class EmpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp1 e1=new Emp1(2,"abc");
		Emp1 e2=new Emp1(2,"abc");
        Emp1 e3=new Emp1(3,"cde");
        HashSet<Emp1> hs=new HashSet<Emp1>();
        hs.add(e1);
        hs.add(e2);
        hs.add(e3);
        System.out.println(hs.size());

		

	}

}
