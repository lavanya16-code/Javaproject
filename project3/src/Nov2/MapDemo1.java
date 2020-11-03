package Nov2;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.*;


public class MapDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>a =Arrays.asList(new String[] {"Apple","Mango","Orange","Banana"});
		List s=a.stream().map(str->str.length()).collect(Collectors.toList());
		System.out.println(s);
	}

}
