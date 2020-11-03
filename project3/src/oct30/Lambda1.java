package oct30;
import java.lang.*;
import java.util.function.BiFunction;
public class Lambda1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiFunction<Integer,Integer,Integer> a=(x,y)->((int)Math.pow(x, y));
		System.out.println(a.apply(9, 2));

	}

}
