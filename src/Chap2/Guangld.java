package Chap2;

public class Guangld {
    public static int  max(int[] array) {
    	int a=0;
    	int max=0;
    	for (int i = 0; i < array.length; i++) {
			for (int j = i; j < array.length; j++) {
				max=(j-i)*(array[i]>array[j] ? array[j]:array[i]);
				if (max>a) {
					a=max;
				}
			}
		}	
		return a;
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,8,6,2,5,4,8,3,7};
		int b=max(a);
		System.out.println(b);
	}

}
