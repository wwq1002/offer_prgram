package Chap2;
//统计一个数字在排序数组中出现的次数。
/**
 * 思路：在数组基本有序的情况下能用的时间复杂度最小是O(n)，空间复杂度是O(1),选择插入排序
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
