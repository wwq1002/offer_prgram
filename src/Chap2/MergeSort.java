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
		//�����ֱ�Ϊ ���������飬��ָ�룬��ָ�룬��������
		//��Ϊʹ���˵ݹ飬�������Ǳ���涨�ݹ��������򽫽�������ѭ��
		if (right<=left) {
			return 0;
		}
			//��������зָ�
			int mid = (left + right) / 2;
			//����������������й鲢����
			int left1=mergeSort(arr, left, mid, temp);
			//����������������й鲢����
			int right2=mergeSort(arr, mid + 1, right, temp);
			//��������кϲ�
			int merged=Merge(arr, left1, mid, right, temp);
			return left1 + right2 + merged;
	
 
	}
	//�ϲ�����
	public static int Merge(int[] arr, int left, int mid, int right, int[] temp) {
		int i = left;
		int j = mid + 1;
		int count=0;
		//tΪ�������������
		int t = 0;
		while (i <= mid && j <= right) {
			//�����߶�û�е������һλʱ�����бȽϲ��������鸴��
			if (arr[i] < arr[j]) {
				temp[t++] = arr[i++];
				
			} else {
				temp[t++] = arr[j++];
				count+=mid-left+1;
			}
		}
		//������һ�����鸴����Ϻ󣬽���һ�������ڵ�����ȫ�����ƽ���������
		while (i <= mid) {
			temp[t++] = arr[i++];
		}
		while (j <= right) {
			temp[t++] = arr[j++];
		}
		t = 0;
		//�������������Ѿ��źõ�����ȫ�����ƽ�ԭ���飬�������
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
