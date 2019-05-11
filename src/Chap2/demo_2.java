package Chap2;

public class demo_2 extends Thread {
	
	public static int fun(int x)
	{
	    int countx = 0;
	    while(x!=0)
	    {
	        countx++;
	        x = x & (x-1);
	    }
	    return countx;
	}
	public static void main(String[] args) {
		int a=fun(500);
		System.out.println(a);
	}

}
