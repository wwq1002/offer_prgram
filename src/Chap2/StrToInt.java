package Chap2;

/*将一个字符串转换成一个整数(实现Integer.valueOf(string)的功能，但是string不符合
数字要求时返回0)，要求不能使用字符串转换整数的库函数。 数值为0或者字符串不是一个合法的数值则返回0。
*/
//jiang将一个字符串转换成一个整数
public class StrToInt {
	public int StrToInt(String str) {
  
		int i=0;
		int flag=1;
		int sum=0; 
		if (str.length()==0||str==null) {
			return 0;
		}
		if (str.length()==1&&(str.charAt(0)=='+'||str.charAt(0)=='-')) {
			return 0;
		}
		if (str.charAt(i)=='+') {
			i++;
		}
		if (str.charAt(i)=='-') {
			i++;
			flag=-1;
		}
		for (; i < str.length(); i++) {
			if (str.charAt(i)-'0'<0||str.charAt(i)-'0'>9) {
				return 0;
			}else {
				sum=sum*10+str.charAt(i)-'0';
			}
			
		}
		return sum*flag;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
