package Chap2;

public class reOrderArray {
	 public static void reOrderArray(int [] array) {
	        int j=0;//��¼��һ��������λ��
	        int m=0;//��¼�ź����������λ��
	     
	        for(int i=0;i<array.length;i++) {
	        	if(isOdd(array[i])) {//�ҵ���һ������
	        		int temp=array[i];
	        		int odd_i=i;
	        		for(;odd_i>0;odd_i--) {//�ƶ�����ǰ��������κ���
	        			array[odd_i]=array[odd_i-1];
	        		}
	        	   array[0]=temp;
	        	   j=i;
	        	   break;
	        	}
	        }
	        for(++j;j<array.length;j++) {
	        	if (isOdd(array[j])) {
	        		int temp=array[j];
	        		int odd_j=j;
	        		for(;odd_j>m;odd_j--) {
	        			array[odd_j]=array[odd_j-1];
	        		}
	        		array[++m]=temp;
	        	}
	        }
	        
 }
	 public static boolean isOdd(int val) {
		return (val & 1)==1;

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array= {1,2,3,4,5,6,7};
		reOrderArray(array);
		for(int i=0;i<array.length;i++)
        {
            System.out.print(array[i]+" ");
        }
    }
		
}


