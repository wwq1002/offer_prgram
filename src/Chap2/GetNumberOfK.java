package Chap2;
//ͳ��һ�����������������г��ֵĴ�����
/**
 * ˼·������������������������õ�ʱ�临�Ӷ���С��O(n)���ռ临�Ӷ���O(1),ѡ���������
 * @author wwq
 *
 */

public class GetNumberOfK {
	public static int GetNumberOfK(int [] array , int k) {
		if (array==null||array.length==0) {
			return 0;
		}
		int sum=0;
		for (int i = 0; i < array.length; i++) {
			if (k==array[i]) {
				sum++;
			}
		}
		return sum;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array={1,2,3,3,3,3,4,5};
		System.out.println(GetNumberOfK(array,3));
	}

}
