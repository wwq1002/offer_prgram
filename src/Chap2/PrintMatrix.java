package Chap2;

import java.util.ArrayList;

/**
 * ����һ�����󣬰��մ���������˳ʱ���˳�����δ�ӡ��ÿһ������
 */
//˼·ֻҪ���������һȦ���꣬�Ϳ�����С�������Ƶݹ��ȥ���
public class PrintMatrix {
	  public ArrayList<Integer> printMatrix(int [][] matrix){
		if (matrix==null||matrix.length==0) {
			return null;
		}
		 ArrayList<Integer> list=new ArrayList<>();
		 int left=0;//��ʼ����
		 int right=matrix[0].length-1;//��Ȧ����
		 int top=0;//��ʼ����
		 int bottom=matrix.length-1;//��Ȧ����
		 
		 while(left<=right&&top<=bottom) {//�����ʱ��
			 //����while������ʱ�������ң���Ϊ����1
			 for(int i=left;i<=right;i++) {
				 list.add(matrix[top][i]);
			 }
			//Ҫ�ߴ��ϵ��£�������Ϊ2������Ҫ����top<botoom�����ֻ�����һ�У���û�б�Ҫ����
			 if(top<bottom) {
				 for(int j=top+1;j<=bottom;j++)
					 list.add(matrix[j][right]);
			 }
			 //Ҫ������3ʱ��һ����Ҫ��������2��
			 if(top<bottom&&left<right) {
				 for (int k=right-1;k>=left;k--) {
					 list.add(matrix[bottom][k]);
				}
				 
			 }
			 //Ҫ������4��һ��Ҫ�ȷ�������2��3������Ҫ������2�����ϸ���Ϊbottom�Ѿ�����һ����
			 if(top<bottom-1&&left<right) {
				 for (int d = bottom-1; d > top; d--) {
					list.add(matrix[d][left]);
				}
				 
			 }
			left++;
			right--;
			top++;
			bottom--;
			 
		 }
		 return list;
		 
		 
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
