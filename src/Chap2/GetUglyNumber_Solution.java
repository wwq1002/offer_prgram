package Chap2;

public class GetUglyNumber_Solution {
	 public static int GetUglyNumber_Solution(int index) {
		 if (index==0) {
			return 0;
		}		 
		 int num_2=0,num_3=0,num_5=0;
		 int result[]=new int[index];
		 result[0]=1;
		 for (int i = 1; i < result.length; i++) {
			int M2=result[num_2]*2;
			int M3=result[num_3]*3;
			int M5=result[num_5]*5;
			result[i]=Math.min(M2, Math.min(M3,M5));
			if (result[i]==M2) num_2++;
			if (result[i]==M3) num_3++;
			if (result[i]==M5) num_5++;
			
			
		}
	        return result[index-1];
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(GetUglyNumber_Solution(5));
		
	}

}
