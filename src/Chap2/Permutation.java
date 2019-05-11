package Chap2;
import java.util.ArrayList;
import java.util.Collections;
/*
 * ����һ���ַ���,���ֵ����ӡ�����ַ������ַ����������С����������ַ���abc,
 * ���ӡ�����ַ�a,b,c�������г����������ַ���abc,acb,bac,bca,cab��cba��
*/
public class Permutation {
    public ArrayList<String> permutation(String str) {
        ArrayList<String> list = new ArrayList<>();
        if (str == null || str.length() == 0) {
           return list;
        }

        collect(str.toCharArray(), 0, list);
        Collections.sort(list);
        return list;
    }

    private void collect(char[] chars, int begin, ArrayList<String> list) {
        if (begin == chars.length - 1) {
            // ���ܴ�����ͬ������
            String s = String.valueOf(chars);
            if (!list.contains(s)) {
                list.add(s);
                return;
            }
        }

        for (int i = begin; i < chars.length; i++) {
            swap(chars, i, begin);
            collect(chars, begin + 1, list);
            swap(chars, i, begin);
        }

    }

    private void swap(char[] chars, int i, int j) {
        char temp = chars[j];
        chars[j] = chars[i];
        chars[i] = temp;
    }

    public static void main(String[] args) {
        Permutation a = new Permutation();
        System.out.println(a.permutation("abc"));
    }
}

