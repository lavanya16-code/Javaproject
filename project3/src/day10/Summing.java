package day10;
import java.util.*;

public class Summing implements Runnable {

    int a;

    public Summing(int a) {
        this.a = a;
    }

    public void run() {
        addRandom();
    }

    public void addRandom() {
        Random rand = new Random();
        int n = rand.nextInt(10) + 1;
        System.out.println("number generated: " + n);
        synchronized (this) {
            a += n;
        }
    }
public static void main(String[] args) {
	    int base = 0;

	    Summing sum2 = new Summing(base);

	    Thread t1 = new Thread(sum2);
	    Thread t2 = new Thread(sum2);
	    Thread t3 = new Thread(sum2);
	    Thread t4 = new Thread(sum2);
	    Thread t5 = new Thread(sum2);

	    t1.start();
	    t2.start();
	    t3.start();
	    t4.start();
	    t5.start();

	    try {
	        t1.join();
	        t2.join();
	        t3.join();
	        t4.join();
	        t5.join();
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }

	    System.out.print("final result: " + sum2.a);
	}

	}

