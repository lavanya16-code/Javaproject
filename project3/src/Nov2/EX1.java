package Nov2;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.*;

public class EX1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> a=Arrays.asList(new Integer[] {13,60,3,68,9,4,60});
		List<Integer> s=a.stream().filter(i->i>10).limit(4).collect(Collectors.toList());
		System.out.println(s);

	}

}
