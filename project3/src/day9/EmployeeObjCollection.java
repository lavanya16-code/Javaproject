package day9;
import java.util.HashSet;

public class EmployeeObjCollection {
		
		 int id;
		 String name;
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
	public EmployeeObjCollection(int id,String name){
		this.id=id;
		this.name=name;
		}

	public String toString() {
		return id+" "+name;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<EmployeeObjCollection> hs=new HashSet<EmployeeObjCollection>();
		EmployeeObjCollection e1=new EmployeeObjCollection(20,"lord shiva");
		EmployeeObjCollection e2=new EmployeeObjCollection(30,"god");
		hs.add(e1);
		hs.add(e2);
		for(EmployeeObjCollection e:hs) {
			System.out.println(e);
			
			
		}

	}

}
