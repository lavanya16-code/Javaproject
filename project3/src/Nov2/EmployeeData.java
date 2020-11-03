package Nov2;

public class EmployeeData implements Employee {
	private int name;
	private int age;
	public EmployeeData() {
		
	}
	@Override
	public int getName() {
		return name;
	}
	@Override
	public void setName(int name) {
		this.name=name;
	}
	@Override
	public int getAge() {
		return age;
	}
	@Override
	public void setAge(int age) {
		this.age=age;
	}
	
	
	

}
