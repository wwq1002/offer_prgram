package Chap2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/*��һ���漰վ̨6��5��4
�ڶ����漰վ̨5��4��3��2
�������漰վ̨4��3��2
�������漰վ̨1
������Ȼվ̨4��Ӫ����·��࣬��3��*/
public class sum_taishu {
	static int maxtosum(int a[][]){
		ArrayList<Integer> b=new ArrayList<>();
		for (int i = 0; i < a.length; i++) {
			while(a[i][1]-a[i][2]>0);
			b.add(a[i][1]--);
		}
		
		return Collections.max(b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		  int n=in.nextInt();
		  int a[][]=new int[n][2];
		  for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				a[i][j]=in.nextInt();
			}
		}
		  System.out.println(maxtosum(a));
	}

}
