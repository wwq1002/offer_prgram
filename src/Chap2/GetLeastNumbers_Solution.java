package Chap2;

import java.util.ArrayList;
import java.util.Arrays;

public class GetLeastNumbers_Solution {
	public static ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
		ArrayList<Integer> min_k=new ArrayList<Integer>();
		if (input.length==0) {
			return min_k;
		}
		if (k>input.length) {
			return min_k;
		}
		
		Arrays.sort(input);
		for (int i = 0; i < k; i++) {
			min_k.add(input[i]);
		}
		
		return min_k;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={0,1,5,1,6,2,7,3,8};
		ArrayList<Integer> min_k=new ArrayList<Integer>();
		min_k=GetLeastNumbers_Solution(a, 4);
		for (int i = 0; i < min_k.size(); i++) {
			System.out.println(min_k.get(i));
		}
	}

}
