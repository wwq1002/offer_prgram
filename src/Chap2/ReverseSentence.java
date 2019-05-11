package Chap2;

import java.util.Stack;

public class ReverseSentence {
	 public static String ReverseSentence(String str) {
		 /*int len=str.length();
		 String str_rever="";
		 str=" "+str;
		 Stack<Character> stack=new Stack<>();
		 for (int i = str.length()-1; i>=0; i--) {
			if (str.charAt(i)!=' ') {
				stack.push(str.charAt(i));
			}else {
				while (!stack.isEmpty()) {
					str_rever+=stack.pop();	
				}
				str_rever+=" ";
			}
		}
		 
		 
		 return str_rever.substring(0, len);*/
		 if(str.trim().equals("")){
	            return str;
	        }
	        String[] a = str.split(" ");
	        StringBuffer o = new StringBuffer();
	        int i;
	        for (i = a.length; i >0;i--){
	            o.append(a[i-1]);
	            if(i > 1){
	                o.append(" ");
	            }
	        }
	        return o.toString();
		 
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(ReverseSentence("student. a am I"));
	}

}
