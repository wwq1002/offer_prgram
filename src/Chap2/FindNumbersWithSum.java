package Chap2;
import java.util.ArrayList;
import java.util.HashMap;
public class FindNumbersWithSum {
	public static ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
		ArrayList<Integer> sum_2=new ArrayList<Integer>(); 
		HashMap<Integer,ArrayList<Integer>> two=new HashMap<>();
		if (array==null) {//����Ϊ�յ����
				return null;
			}  
		   if (array.length==0||sum==0) {//���������İ���
		     	return sum_2;
		   }
		       if (array[0]>sum||array.length==1) {//����ǵ���������ʱ��Ҳ��������
				return null;
	    }
       int i=0;
       int j=0;
       int sum_temp=0;
       while (i<array.length&&array[i]<sum) {
    	   j=i+1;
    	   while (j<array.length&&array[j]<sum) {
    		ArrayList<Integer> list=new ArrayList<Integer>();   
			if (array[i]+array[j]==sum) {
				sum_temp=array[i]*array[j];//���ǵĻ�
				list.add(array[i]);
				list.add(array[j]);
				two.put(sum_temp,list);
			}
			
			j++;
		}
    	i++;   
	}
       
       int small=sum*sum;
       for(Integer num:two.keySet()) {//�����Сֵ
    	 if (num<small) {
			small=num;
		}
       }
       ArrayList<Integer> list2=new ArrayList<>();
       for(Integer num:two.keySet()) {//����С��ֵ���
      	 if (num==small) {
      		list2=two.get(num);
  			
  		}
       } 
  
       return list2;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={};
		ArrayList<Integer> sum_3=new ArrayList<Integer>();
		sum_3=FindNumbersWithSum(a,0);
		/**
		 * ���룺�Լ����
		 */
	}

}
