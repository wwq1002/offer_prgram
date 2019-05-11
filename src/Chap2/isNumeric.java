package Chap2;

/*请实现一个函数用来判断字符串是否表示数值（包括整数和小数）。
例如，字符串"+100","5e2","-123","3.1416"和"-1E-16"都表示数值。 但是"12e","1a3.14","1.2.3","+-5"和"12e+4.3"都不是。
*/
public class isNumeric {
	 public boolean isNumeric(char[] str) {
	     //考虑正则表达式：https://www.runoob.com/java/java-regular-expressions.html
		//+一次或多次匹配前面的字符或子表达式。例如，"zo+"与"zo"和"zoo"匹配，但与"z"不匹配。+ 等效于 {1,}。
		//* 零次或多次匹配前面的字符或子表达式。例如，zo* 匹配"z"和"zoo"。* 等效于 {0,}。
		//? 零次或一次匹配前面的字符或子表达式。例如，"do(es)?"匹配"do"或"does"中的"do"。? 等效于 {0,1}。
		// [+-]?[0-9]*(\\.[0-9]*)?([eE][+-]?[0-9]+)?
		 //[+-]?  出现一次或者零次
		 //[0-9]* 零次或者多次出现
		 //(\\.[0-9]*)?  当有小数点时，出现零次或者多次，小数点之后的数字，但是这也是可有可无的
		 //([eE][+-]?[0-9]+)?出现一个或者零次，e/E+(+-)+(0-9)+最后一个加号的意义正负号后的0-9数字必须出现
		 if (str == null) {
	            return false;
	        }
	        return new String(str).matches("[+-]?[0-9]*(\\.[0-9]*)?([eE][+-]?[0-9]+)?");
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
