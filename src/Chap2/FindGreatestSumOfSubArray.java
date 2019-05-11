package Chap2;

public class FindGreatestSumOfSubArray {
	public static int FindGreatestSumOfSubArray(int[] array) {
		//如果有正数和负数的话就进行下面的操作
		int len=array.length;
		int a[]=new int[len];
		if (array.length==1) {
			return array[0];		
		}		
		for (int i = 0; i < array.length; i++) {
			if (i==0) {
				a[i]=array[i];
			}else {
				a[i]=array[i]+a[i-1];
			}
		}
		int b=a[0];
		a[0]=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length; j++) {
				int sum=a[j]-a[i];
				if (sum>b) {
					b=sum;
				}
			}
		}
		boolean falg=false;
		int c=0;
		int d=array[0];
		//如果全是负数，没有正数，将最大的负数输出
		for (int i = 0; i < a.length; i++) {
			if (array[i]<0) {
				c++;
				if (array[i]>d) {
					d=array[i];
				}
			}
			
		}
		if (c==array.length) {
			return d;
		}
		return b;
		
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array={6};
		System.out.println(FindGreatestSumOfSubArray(array));
	}

}
