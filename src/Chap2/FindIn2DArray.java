package Chap2;
/**
 * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */

public class FindIn2DArray {
/**
 * Binary Search--二分查找
 *　采用二分法查找时，数据需是排好序的。 基本思想：假设数据是按升序排序的，对于给定值x，从序列的中间位置开始比较，如果当前位置值等于x，则查找成功；
 * 若x小于当前位置值，则在数列的前半段 中查找；若x大于当前位置值则在数列的后半段中继续查找，直到找到为止。
 * 二分法查找在针对大量有序排列的情况下发挥出很优越的效率，其时间复杂度O(lgN)。
 */
/**
 * 方法一：对每一行的一维数组做一个二分查找
 * 如果矩阵是M*N,一次二分查找是O(lgN),M行就是M*O(lgN)
 * @param target 要查找的数
 * @param array  二维数组
 * @return true在数据中找到的target
 */
	public boolean Find2(int target,int[][] array) {
		if(array!=null && array.length>0) {
			int high=array[0].length-1;
			for(int i=0;i<array.length;i++) {
				int low=0;
				while(low<=high) {
					int mid=low+(low+high)/2;
					if(target>array[i][mid]) {
						low=mid+1;
							
					}else if(target<array[i][mid]){
						high=mid-1;
						
					}else {
						return true;
					}
					
				}
						
			}	
			return false;
		}
					
		return false;
	}

	/**
	 * 方法二：更推荐的做法
	 * 由于矩阵从上到下递增，从左到右递增
	 * 总是和二维矩阵的右上角元素比较，（对称的左下角也可以）
	 * 如果目标数值比右上角大，则删除该行，如果目标数值比右上角小，则删除该列
	 *  
	 */
	public boolean Find(int target,int[][] array) {
		if(array!=null && array.length>0) {
			int N=array.length;//总行数
			int col=array[0].length-1;//列索引
			int row=0;//行索引
			while(row<N&&col>=0) {
				if(target<array[row][col]) {
					col--;
			  } else if (target>array[row][col]) {
				    row++;
			}else {
				return true;
			}			
		  }
			
		}else
			return false;
		
		return false;
	}
	
	
}
