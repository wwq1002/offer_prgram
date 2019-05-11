package Chap2;

public class demo {
	public static int product(int a) {
		return a*a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=3,j,k;
		j=product(i++);
		k=product(++i);
		System.out.println(j+" "+k);
	}

}
