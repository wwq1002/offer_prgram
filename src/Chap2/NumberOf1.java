package Chap2;
/**
 * 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方
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
