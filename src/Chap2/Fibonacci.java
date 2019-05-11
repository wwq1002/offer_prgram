package Chap2;
/**
 * ����Ҫ������һ������n���������쳲��������еĵ�n�
 * 쳲��������У�Fibonacci sequence�����ֳƻƽ�ָ����С�����ѧ���а��ɶࡤ쳲�������Leonardoda Fibonacci��
 * �����ӷ�ֳΪ���Ӷ����룬���ֳ�Ϊ���������С���ָ��������һ�����У�1��1��2��3��5��8��13��21��34����������ѧ�ϣ�쳲�����
 * ���������±��Ե��Ƶķ������壺F(1)=1��F(2)=1, F(3)=2,F(n)=F(n-1)+F(n-2)��n>=4��n��N*��
 */
public class Fibonacci {
	/*�Ƽ�������*/
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
	/*�ݹ鲻�Ƽ�*/
	
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