package Chap2;
/**
 * 现在要求输入一个整数n，请你输出斐波那契数列的第n项。
 * 斐波那契数列（Fibonacci sequence），又称黄金分割数列、因数学家列昂纳多·斐波那契（Leonardoda Fibonacci）
 * 以兔子繁殖为例子而引入，故又称为“兔子数列”，指的是这样一个数列：1、1、2、3、5、8、13、21、34、……在数学上，斐波纳契
 * 数列以如下被以递推的方法定义：F(1)=1，F(2)=1, F(3)=2,F(n)=F(n-1)+F(n-2)（n>=4，n∈N*）
 */
public class Fibonacci {
	/*推荐迭代法*/
	public static int fib1(int n) {
		int numN;
		if(n<=0) {
			return 0;
		}
		int a=0;
		int b=1;
		 while(n>0) {
			 b=a+b;
			 a=b-a;
			 n--;
		 }
		return a;
	}
	/*递归不推荐*/
	
	public static int fib2(int n) {
		if(n<=0) {
			return 0;
		}
		if (n==1) {
			return 1;
		}
		return fib2(n-1)+fib2(n-2);
}
	public static void main(String[] args) {
        System.out.println(fib1(8));
        System.out.println(fib2(8));
    }
}