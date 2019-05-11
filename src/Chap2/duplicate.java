package Chap2;

public class duplicate {
	public static boolean duplicate(int numbers[],int length,int [] duplication) {
			boolean[] k = new boolean[length];
			        for (int i = 0; i < k.length; i++) {
			            if (k[numbers[i]] == true) {
			                duplication[0] = numbers[i];
			                return true;
			            }
			            k[numbers[i]] = true;
			        }
			        return false;
		
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {2,1,3,0,6};
		int[] b=new int[2];
		duplicate(a, 5, b);
	}

}
