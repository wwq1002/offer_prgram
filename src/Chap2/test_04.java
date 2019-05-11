package Chap2;

import java.util.ArrayList;
import java.util.Scanner;

public class test_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		      int a[][] = null; 
				Scanner in=new Scanner(System.in);
				ArrayList<ArrayList<Integer>> list=new ArrayList<ArrayList<Integer>>();
				while(true) {
					String str=in.nextLine();
					if(str.length()==0) {
						break;
					}
					String[] strlist=str.split(" ");
					ArrayList<Integer> list1=new ArrayList<>();
					for (String string:strlist) {
						list1.add(Integer.parseInt(string));
					}
					list.add(list1);
				}
				in.close();
				for (ArrayList<Integer> arrayList : list) {
					for (int i = 0; i < list.size(); i++) {
						for (int j = 0; j < arrayList.size(); j++) {
							a[i][j]=arrayList.get(j);
						}
					}
				}
				System.out.println();
	}

}
