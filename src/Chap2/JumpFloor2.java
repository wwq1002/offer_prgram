package Chap2;

/**
 * һֻ����һ�ο�������1��̨�ף�Ҳ��������2��������Ҳ��������n����
 * �����������һ��n����̨���ܹ��ж�����������
 */
public class JumpFloor2 {
/*	����1��̨��ֻ��1�ֿ��ܣ�����2��̨�������ֿ���f(1)=1,f(2)=2 
	Ҫ����3��̨�ף�������1��������Ҳ������2������,����ֻ��Ҫ����1��̨�׵Ŀ������+����2�׵Ŀ������+f(0),f(3)=f(2)+f(1)+1
	ͬ����n��̨�ף�������n-1��̨������������n-1,n-2,n-3...f(n)=f(n-1)+f(n-2)+f(n-3)+...+1
	���f(n)=f(n-1)+f(n-2)+f(n-3)...+f(n-n)=f(0)+f(1)+f(2)+...+f(n-1)<1>
	   f(n-1)=f(0)+f(1)+..f(n-2)<2>
	   <1>-<2>=f(n-1)
	   f(n)=2*f(n-1)
*/
	private static int jumpFloor2(int target) {
		if(target==0) {
			return 0;
		}
		if(target==1)
			return 1;
	
		return 2*jumpFloor2(target-1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=jumpFloor2(5);
		System.out.println(a);
	}

}
