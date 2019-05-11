package Chap2;

import java.util.HashMap;
import java.util.Map;

public class MoreThanHalfNum_Solution {
	public static int MoreThanHalfNum_Solution(int [] array) {
		int len=array.length;
		int value=0;
		int A=0;
		int c=0;
		HashMap<Integer, Integer> hashMap=new HashMap<>();
		for(int i=0;i<len;i++) {	
			if (!hashMap.containsKey(array[i])) {
				hashMap.put(array[i], value+1);
			}else {
				hashMap.put(array[i], hashMap.get(array[i])+1);
				
			}	
		}
		for(Map.Entry<Integer, Integer> mapEntry:hashMap.entrySet()) {
			if (mapEntry.getValue()>len/2) {
				 A=mapEntry.getKey();		 
			}
			else {
				c++;
				if(c==hashMap.size()) {
					
					return 0;
				}
				
			}
		}
	
		return A;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,2,2,2,5,4,2,};
		int b=MoreThanHalfNum_Solution(a);
		System.out.println(b);
	}

}
