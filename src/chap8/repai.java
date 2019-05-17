import java.util.Scanner;

/*
 * 给你一个原始字符串，根据该字符串内每个字符出现的次数，按照ASCII码递增顺序重新调整输出。
*/
public class repai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		String  str=scanner.nextLine();
		String  str01="";
		int[] count=new int[256];
		for (int i = 0; i < str.length(); i++) {
			count[str.charAt(i)]++;
		}
		boolean flag=false;
		//做一个标志位
		 do{
			 flag=false;
			for (int i = 0; i < count.length; i++) {
				if (count[i]!=0) {
					str01+=String.valueOf((char)i);
					count[i]--;
					flag=true;
				}
			}
			
		 }while(flag==true);
		
		System.out.println(str01);
	}

}
