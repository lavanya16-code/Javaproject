package Nov2;

import java.util.Arrays;
import java.util.List;

public class ForDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l=Arrays.asList(3,4,5,6);
	    for(int i=0;i<l.size();i++)
	    	System.out.println(l.get(i));
	    System.out.println();
	    for(int o:l)
	    	System.out.println(o);
	    System.out.println();
		l.forEach(i->{
			System.out.println(i);
		});
		System.out.println();
		}

	}
