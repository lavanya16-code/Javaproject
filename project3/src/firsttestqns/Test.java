package firsttestqns;

public interface EX1 {

	int a=33;
}

public interface EX2 {
int a=44;
}
public class Test implements EX1,EX2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(a);
	}

}
