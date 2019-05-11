package Chap2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 * 在一个字符串(0<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,
 * 并返回它的位置, 如果没有则返回 -1（需要区分大小写）.
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
