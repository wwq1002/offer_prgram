package Chap2;

public class multiply {
	public int[] multiply(int[] A) {
		int length=A.length;
		int[] B=new int[length];
		if (length!=0) {
			B[0]=1;
			//计算下三角连乘
			for (int i = 1; i < B.length; i++) {
				B[i]=B[i-1]*A[i-1];
			}
			//B[n]就会在第一个循环的时候，计算好，而把B[0]则在下一个循环的时候计算好。
			int temp=1;
			//计算上三角
			for (int j = length-2; j >= 0; j--) {
				temp*=A[j+1];
				B[j]*=temp;
			}
		}
		return B;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
