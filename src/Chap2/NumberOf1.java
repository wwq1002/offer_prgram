package Chap2;
/**
 * ����һ��double���͵ĸ�����base��int���͵�����exponent����base��exponent�η�
 */
public class NumberOf1 {
	 public static double Power(double base, int exponent) {
		 if(base==0) {
			 return 0;
		 }
		    double result=1.0;
		    int positiveExponent=Math.abs(exponent);
	        while(positiveExponent!=0) {
	        	result*=base;
	        	positiveExponent--;
	        }
	        return exponent < 0 ? 1 /result:result;
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a=Power(2,-1);
		System.out.println(a);
	}

}
