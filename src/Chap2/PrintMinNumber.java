package Chap2;

import java.util.Arrays;

public class PrintMinNumber {
	public String PrintMinNumber(int [] numbers) {
	int[] n=new int[numbers.length];
	String str_2="";
	Boolean flag=true;
	int len=String.valueOf(numbers[0]).length();
	for (int i = 0; i < numbers.length; i++) {
		String str=String.valueOf(numbers[i]);
		if (len!=str.length()) {	
			flag=false;
		}
	}
	if (flag==true) {
		Arrays.sort(numbers);
		for (int j = 0; j < numbers.length; j++) {
			String str_3=String.valueOf(numbers[j]);
			str_2=str_3+str_2;
		}
		return str_2;
	}else {
		String str_5="";
		int min_0=String.valueOf(numbers[0]).indexOf(0);
		for (int i = 0; i < n.length; i++) {
			String str_4=String.valueOf(numbers[i]);
			if(str_4.indexOf(0)<min_0) {
				str_5=str_4;
			}
		}
		
	}
	
	
	
	
	
	
	
		return null;

   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
