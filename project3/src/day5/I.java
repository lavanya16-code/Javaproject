package day5;

public interface I {
	void add();
	default void Show()
	{
		System.out.println("in Show");
	}
	static void show1()
	{
		System.out.println("in static show1");
	}


}
