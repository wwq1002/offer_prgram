package Chap2;

public class test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String string="xxxxxxxxxxxxxxx#123#456#zzzzz";
			int n=string.indexOf("#");
			int k=string.indexOf("#",n+1);
			String s2=string.substring(n+2,k);
			System.out.println(s2);
			
	}

}
