package Chap2;

public class test_sum_max {
	public static int[] sum_max(int sum) {
		 int[] a=new int[sum+1];
	     int[] b=new int[sum+1];
	     for (int i = 1; i <a.length; i++) {
				a[i]=i;
			}
	        for (int i = 1; i<b.length; i++) {
				if (i==1) {
					b[i]=a[i];
				}else {
					b[i]=a[i]+b[i-1];
					
				}
			}
	     return b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] c=sum_max(5);
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
	}

}
