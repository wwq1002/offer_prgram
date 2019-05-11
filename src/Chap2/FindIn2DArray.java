package Chap2;
/**
 * ��һ����ά�����У�ÿһ�ж����մ����ҵ�����˳������ÿһ�ж����մ��ϵ��µ�����˳������
 * ���һ������������������һ����ά�����һ���������ж��������Ƿ��и�������
 */

public class FindIn2DArray {
/**
 * Binary Search--���ֲ���
 *�����ö��ַ�����ʱ�����������ź���ġ� ����˼�룺���������ǰ���������ģ����ڸ���ֵx�������е��м�λ�ÿ�ʼ�Ƚϣ������ǰλ��ֵ����x������ҳɹ���
 * ��xС�ڵ�ǰλ��ֵ���������е�ǰ��� �в��ң���x���ڵ�ǰλ��ֵ�������еĺ����м������ң�ֱ���ҵ�Ϊֹ��
 * ���ַ���������Դ����������е�����·��ӳ�����Խ��Ч�ʣ���ʱ�临�Ӷ�O(lgN)��
 */
/**
 * ����һ����ÿһ�е�һά������һ�����ֲ���
 * ���������M*N,һ�ζ��ֲ�����O(lgN),M�о���M*O(lgN)
 * @param target Ҫ���ҵ���
 * @param array  ��ά����
 * @return true���������ҵ���target
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
	 * �����������Ƽ�������
	 * ���ھ�����ϵ��µ����������ҵ���
	 * ���ǺͶ�ά��������Ͻ�Ԫ�رȽϣ����ԳƵ����½�Ҳ���ԣ�
	 * ���Ŀ����ֵ�����ϽǴ���ɾ�����У����Ŀ����ֵ�����Ͻ�С����ɾ������
	 *  
	 */
	public boolean Find(int target,int[][] array) {
		if(array!=null && array.length>0) {
			int N=array.length;//������
			int col=array[0].length-1;//������
			int row=0;//������
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
