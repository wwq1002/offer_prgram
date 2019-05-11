package Chap2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FindNumsAppearOnce {
	public static void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
		Arrays.sort(array);	
		for (int i = 0; i < array.length;i++) {
					
			}
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String string=sc.next().toString();
		String[] arr=string.split(",");
		int[] b=new int[arr.length];
		for (int i = 0; i < arr.length;i++) {
			b[i]=Integer.parseInt(arr[i]);
		}
		int[] num_1=new int[1];
		int[] num_2=new int[1];
		FindNumsAppearOnce(b,num_1,num_2);	
		System.out.print(num_1[0]+","+num_2[0]);
		
	}

}
/*
public static void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
		List<Integer> list_a=new ArrayList<>();
		List<Integer> list_b=new ArrayList<>();
		for (int i = 0; i < array.length; i++) {
			Integer aInteger=array[i];
			if (!list_a.contains(aInteger)&&!list_b.contains(aInteger)) {
				list_a.add(aInteger);
			}else {
				list_a.remove(aInteger);
				list_b.add(aInteger);
			}
			
			
		}
		num1[0]=list_a.get(0);
		num2[0]=list_a.get(1);
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String string=sc.next().toString();
		String[] arr=string.split(",");
		int[] b=new int[arr.length];
		for (int i = 0; i < arr.length;i++) {
			b[i]=Integer.parseInt(arr[i]);
		}
		int[] num_1=new int[1];
		int[] num_2=new int[1];
		FindNumsAppearOnce(b,num_1,num_2);	
		System.out.print(num_1[0]+","+num_2[0]);
		
	}*/
