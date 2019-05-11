package Chap2;

import java.util.Arrays;
/**
 * 在一个长度为n的数组里的所有数字都在0到n-1的范围内。 数组中某些数字是重复的，但不知道有几个数字是重复的。也不知道每个数字重复几次。请找出数组中任意一个重复的数字。
 * 例如，如果输入长度为7的数组{2,3,1,0,2,5,3}，那么对应的输出是第一个重复的数字2或者3。
 */
public class FindDuplicate {
	 /**方法一：
     * 先将数组排序，如果有重复元素将会相邻。然后相邻元素两两比较即可
     * @param numbers 待查找的数组
     * @param length 数组的长度，其实就是numbers.length
     * @param duplication 数组用于保存重复数字，第一个被找到的重复数字存放在duplication[]中
     * @return 如果在数组中有重复元素
     */
	public boolean duplicate1(int numbers[],int length,int [] duplication) {
		if (numbers==null || length==0) {
			return false;
		}
		Arrays.sort(numbers);
		for(int i=0;i<length-1;i++) {
			if(numbers[i]==numbers[i+1]) {
				duplication[0]=numbers[i];
			return true;
			}
		}
		return false;
	}
    /**
     * 推荐的做法，通过交换元素，将值i保存到numbers[i]
     * 在numbers[i]不和i相等时，如果numbers[i]和numbers[numbers[i]]相等就说明重复元素；
     * 否则就交换这两个元素，这个过程相当于排序。举个例子，通过交换将2放入numbers[2]。
     */
	private void swap(int[] numbers,int p,int q ) {
		int temp=numbers[p];
		numbers[p]=numbers[q];
		numbers[q]=temp;
		
	}
	public boolean duplicate2(int numbers[],int length,int[] duplicate) {
		//判断为数组不存在或者长度为0 ，退出
		if (numbers==null|| length<=0) {
			return false;
		}
		for(int i=0;i<length;i++) {
			
			if(numbers[i]<0||numbers[i]>length-1) {
				return false;
			}
		}
		/*
		 * 外循环n次，然后while内部 相当于做了一个排序，将原本在m位置上的数放在m位置上，
		 * 如果该位置的数循环一次。
		 * 举例：【2.3.1.0.2.5.3】
		 * 第一次for_i=0:
		 * [1.3.2.0.2.5.3]
		 * [3.1.2.0.2.5.3]
		 * [0.1.2.3.2.5.3]
		 * 第二for_i=1
		 * [0.1.2.3.2.5.3]
		 * 第三次for_i=2
		 * [0.1.2.3.2.5.3]
		 * 第四次for_i=3
		 * [0.1.2.3.2.5.3]
		 * 第五次for_i=4
		 * [0.1.2.3.2.5.3]
		 * return true;有重复值2
		 * 跳出循环，进行下一步
		 * 第五次for_i=5
		 * [0.1.2.3.2.5.3]
		 * 第六次for_i=6
		 * [0.1.2.3.2.5.3]
		 * return true;有重复值2
		 * 跳出循环，进行下一步
		 * */
		for(int i=0;i<length;i++) {	
			while (numbers[i]!=i) {
				if(numbers[i]==numbers[numbers[i]]) {
					duplicate[0]=numbers[i];
					return true;
				}
				swap(numbers, i, numbers[i]);
			}
	
		}
		
		return false;
	}
}
