package day8;
import java.util.*;
//@suppressWarnings("all")
public class ArrayListExample {

	public static void main(String[] args) {
		List<Integer> arraylistA=new ArrayList<Integer>();
		ArrayList<String>arraylistB=new ArrayList<String>();
		
        for(int i=0;i<5;i++)
        {
        	arraylistA.add(i);
        }
        System.out.println(arraylistA);
        arraylistB.add("beginner");
        arraylistB.add("java");
        arraylistB.add("tutorial");
        arraylistB.add(".");
        arraylistB.add(3,"com");
        arraylistB.add("java");
        arraylistB.add("site");
        System.out.println("Second Element is"+
        arraylistB.get(2));
        arraylistB.remove("java");
        System.out.println("ArrayListB after "+arraylistB);
        Iterator<Integer> i1=arraylistA.iterator();
        System.out.print("ArrayList arraylistA --> ");
        while(i1.hasNext()) {
        	System.out.print(i1.next()+" ");
        }
        
        System.out.println();
        System.out.print("ArrayList arraylistA --> ");
        for(int j=0;j <arraylistA.size();j++) {
        	System.out.print(arraylistA.get(j) + " ");
        	
        }
        System.out.println();
        //sort an ArrayList
        System.out.print(" sorted ArrayList arraylistA --> ");
        Collections.sort(arraylistA);
        System.out.print(arraylistA);
        Integer a[]= {11,12,13,14,15};
        //Converting Arrays into ArrayList
        List<Integer>arrlist=new ArrayList<Integer>(Arrays.asList(a));
        System.out.println("arrlist "+arrlist.get(0));
        
        
        
		

	}

}
