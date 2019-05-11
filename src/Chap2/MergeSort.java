package Chap2;

/*if (array.length==0||array==null) {
			return 0%1000000007;
		}
		 int p=0;
	      for (int i = 0; i < array.length; i++) {
			int j=i;
			int waitinsert=array[i];
			while (j>0&& waitinsert<array[j-1]) {
				array[j]=array[j-1];
				j--;
				p++;
			}
			array[j]=waitinsert;
		} 
		 
		 return p%1000000007; */
public class MergeSort {
	public static int InversePairs(int[] array) {
		int[] temp = new int[array.length];
		return mergeSort(array, 0, array.length - 1, temp);
	}
 
	public static int mergeSort(int[] arr, int left, int right, int[] temp) {
		//参数分别为 待排序数组，左指针，有指针，辅助数组
		//因为使用了递归，所以我们必须规定递归条件否则将进行无线循环
		if (right<=left) {
			return 0;
		}
			//将数组进行分割
			int mid = (left + right) / 2;
			//对左子数组继续进行归并排序
			int left1=mergeSort(arr, left, mid, temp);
			//对右子数组继续进行归并排序
			int right2=mergeSort(arr, mid + 1, right, temp);
			//将数组进行合并
			int merged=Merge(arr, left1, mid, right, temp);
			return left1 + right2 + merged;
	
 
	}
	//合并函数
	public static int Merge(int[] arr, int left, int mid, int right, int[] temp) {
		int i = left;
		int j = mid + 1;
		int count=0;
		//t为辅助数组的索引
		int t = 0;
		while (i <= mid && j <= right) {
			//当二者都没有到达最后一位时，进行比较并向辅助数组复制
			if (arr[i] < arr[j]) {
				temp[t++] = arr[i++];
				
			} else {
				temp[t++] = arr[j++];
				count+=mid-left+1;
			}
		}
		//当其中一个数组复制完毕后，将另一个数组内的数组全部复制进辅助数组
		while (i <= mid) {
			temp[t++] = arr[i++];
		}
		while (j <= right) {
			temp[t++] = arr[j++];
		}
		t = 0;
		//将辅助数组内已经排好的数据全部复制进原数组，排序完成
		while (left <= right) {
			arr[left++] = temp[t++];
		}
		return count;
 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,3,4,5,6,7,0};
		System.out.print(InversePairs(a));
	}

}
