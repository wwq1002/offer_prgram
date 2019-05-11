package Chap2;
import java.util.ArrayList;
import java.util.HashMap;
public class FindNumbersWithSum {
	public static ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
		ArrayList<Integer> sum_2=new ArrayList<Integer>(); 
		HashMap<Integer,ArrayList<Integer>> two=new HashMap<>();
		if (array==null) {//限制为空的情况
				return null;
			}  
		   if (array.length==0||sum==0) {//这个是特殊的案例
		     	return sum_2;
		   }
		       if (array[0]>sum||array.length==1) {//这个是当不够两个时候，也是无意义
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
				sum_temp=array[i]*array[j];//他们的积
				list.add(array[i]);
				list.add(array[j]);
				two.put(sum_temp,list);
			}
			
			j++;
		}
    	i++;   
	}
       
       int small=sum*sum;
       for(Integer num:two.keySet()) {//求出最小值
    	 if (num<small) {
			small=num;
		}
       }
       ArrayList<Integer> list2=new ArrayList<>();
       for(Integer num:two.keySet()) {//把最小的值输出
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
		 * 输入：自己测吧
		 */
	}

}
