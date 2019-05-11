package Chap2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 * ��һ���ַ���(0<=�ַ�������<=10000��ȫ������ĸ���)���ҵ���һ��ֻ����һ�ε��ַ�,
 * ����������λ��, ���û���򷵻� -1����Ҫ���ִ�Сд��.
*/
public class FirstNotRepeatingChar {
	public static int FirstNotRepeatingChar(String str) {
		if (str==null||str.length()==0) {
			return -1;
		}
		List<Character> list_a=new ArrayList<>();
		List<Character> list_b=new ArrayList<>();
		for (int i = 0; i < str.length(); i++) {
			char ch=str.charAt(i);
			if (!list_a.contains(ch)&&!list_b.contains(ch)) {
				list_a.add(Character.valueOf(ch));
			}else {
				list_a.remove(Character.valueOf(ch));
				list_b.add(Character.valueOf(ch));
			}
		}
		if (list_a.size()<=0) {
			return -1;
		}
		return str.indexOf(list_a.get(0));
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(FirstNotRepeatingChar("google"));
	}

}
