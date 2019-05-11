package Chap2;

import java.util.ArrayList;

public class test06 {
	public static void motion(long m) {
		ArrayList<Integer> sum=new ArrayList<Integer>();
		String string=String.valueOf(m);
		int b=0;
		int c=0;
		for (int i = 0; i < string.length(); i++) {
			if ((string.charAt(i)-'0')!=0) {
				if(m%(string.charAt(i)-'0')==0) {
					b++;
				}
			}else {
				c++;
			}
		}
		int a=b+c;
		if (a==string.length()) {
			System.out.println("G"); 
		}
		if (0<a&&a<string.length()) {
			System.out.println("H");
		}
		
		if (a==0) {
			System.out.println("S");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		motion(73);
	}

}
