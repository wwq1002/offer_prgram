package Chap2;

import java.util.ArrayList;
import java.util.Scanner;

public class zijietiaodong_test_1 {
	public static int  min_minutes(int[][] array) {
		boolean flag=false;
		int sum=0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				if (array[i][j]==2) {
					if (j+1<array[0].length) {
						if (array[i][j+1]==1) {
							array[i][j+1]=2;
							flag=true;
						}
						
					}
					if (j-1>=0) {
						if (array[i][j-1]==1) {
							array[i][j-1]=2;
							flag=true;
						}
						
					}
					if (i+1<array.length) {
						if(array[i+1][j]==1) {
							array[i+1][j]=2;
							flag=true;
						}
						
					}
					if (i-1>=0) {
						if (array[i-1][j]==1) {
							array[i-1][j]=2;
							flag=true;
						}
					
					}
					
					
				} 
				
				if (flag==true) {
					sum++;
				}
				flag=false;
			}
			
			
			
		}
		if (sum==0) {
			return -1;
		}else {
			return sum;
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		ArrayList<ArrayList<Integer>> list=new ArrayList<ArrayList<Integer>>();
		while(true) {
			String string=in.nextLine();
			if(string.length()==0) {
				break;
			}
			String[] strlist=string.split("");
			ArrayList<Integer> list1=new ArrayList<>();
			for (String str:strlist) {
				list1.add(Integer.parseInt(string));
			}
			list.add(list1);
		}
		in.close();
		int[][] arr=new int[list.size()][list.get(0).size()];
		int m=0;
		for (ArrayList<Integer> arrayList:list) {
			int n=0;
			for(Integer integer:arrayList) {
				arr[m][n]=integer;
				n++;
			}
			m++;
		}
		System.out.println(min_minutes(arr));
	}

}
