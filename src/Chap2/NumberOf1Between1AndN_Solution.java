package Chap2;

public class NumberOf1Between1AndN_Solution {
	/*���1~13��������1���ֵĴ���,�����100~1300��������1���ֵĴ�����Ϊ�����ر�����һ��1~13�а���1��������1��10��11��12��13��˹�����6��,���Ƕ��ں�����������û���ˡ�
	ACMerϣ�����ǰ����,������������ձ黯,���Ժܿ���������Ǹ�����������1���ֵĴ�������1 �� n ��1���ֵĴ�������
	*/
	public static int NumberOf1Between1AndN_Solution(int n) {
	
		int sum=0;
		for (int i = 1; i <=n; i++) {
			String str=String.valueOf(i);
			for (int j = 0; j < str.length(); j++) {
				if(str.charAt(j)=='1')
			         	sum++;  
			}
		}
		return sum;
	   
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(NumberOf1Between1AndN_Solution(13));
	}

}
