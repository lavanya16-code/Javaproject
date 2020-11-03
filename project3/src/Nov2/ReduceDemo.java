package Nov2;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.*;
public class ReduceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream.of(10,20,5).reduce((x,y)->x+y).
         ifPresent(System.out::println);
		List<Integer> intList=Arrays.asList(5,6,13,9);
		Optional<Integer>result=intList.stream().
		reduce((a,b)->a>b?a:b);
		if (result.isPresent()) {
			System.out.println("result:"+result.get());
		}

	}

}
