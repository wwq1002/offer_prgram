package Chap2;

public class LeftRotateString {
	public static String LeftRotateString(String str,int n) {
    if (str==""||str==null||str.length()==0) {
		return "";
	}
	  String str1=str.substring(n);
      String str2=str.substring(0, n);
      String str3=str1+str2;
      
		return str3; 
	/*int len=str.length();
		if (len==0) {
			return "";
		}
		n=n%len;
		str+=str;
	   return str.substring(n, len+n);*/
		
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string="abcXYZde";
		String str_end=LeftRotateString(string,2);
		System.out.println(str_end);
	}

}
