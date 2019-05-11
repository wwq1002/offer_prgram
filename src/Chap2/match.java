package Chap2;

public class match {
	public boolean match(char[] str,char[] pattern) {
		if (str==null||pattern==null) {
			return false;
		}
		return matchRecur(str,pattern,0,0);
	}
	public boolean matchRecur(char[] str,char[] pattern,int s,int p) {
		//�����Ա�ָ���ߵ������˵��ƥ��ɹ�
		if (s==str.length&&p==pattern.length) {
			return true; 
		}
		//ģʽ�����ı��ȵ�ĩβ�϶�ûƥ��ɹ���Ҫ��ƥ��ɹ������ǵ������ǣ�ģʽ���ĳ���>=�ı���
		if (p==pattern.length&&s<str.length) {
			return false;
		}
		/*���ڿ�ʼ��ʽ����
		��һ���ַ�����ȵĻ�����ֱ�ӷ���false��return false;
		�ڶ����ַ���Ҫ�����������
			1����ģʽ�еĵڶ��ַ�����   * ʱ���Ǿʹ�Ҷ��������  ���ı���ģʽ��������һ����
			   abc...(�ı���)
			   abc...(ģʽ��)
			   ���룺(��ס������ģʽ���ĳ���>=�ı�������ֻҪ�����ı��Ƿ�Խ�����)
			  if((s<str.length&&str[s]==pattern[p])||(pattern[p]=='.'&&s<str.length)) {
				  return matchRecur(str, pattern, s+1, p+1);
			  } 
			2����ģʽ�еڶ����ַ��� * ʱ�������������������Ҫ������
		                ��һ���ַ�����ȣ�����ab��c*ab��һ��aһ��c����ģʽ���ڶ���* ��ֱ��patten���������ָ�룺
				    return matchRecur(str, pattern, s, p+2);
			     ����һ���ַ����ʱ�ˣ������������Ҫ����������
			       1��abc��a*bc  ģʽ����2�ַ�,�ı�����1�����൱��*������  matchRecur(str, pattern, s+1, p + 2)
			       2��abc��a*abc ģʽ����2�ַ����൱��x*�����ԣ�matchRecur(str, pattern, s, p + 2)
			       3��aaaabc��a*abc �ַ�������1�ַ���ģʽ���䣬������ƥ���ַ���һλ����Ϊ*����ƥ���λ��matchRecur(str, pattern, s+1, p)
	  */
		
		//�ô���ʵ���������߼�����
		
		/*1����ģʽ�еĵڶ��ַ�����   * ʱ���Ǿʹ�Ҷ��������  ���ı���ģʽ��������һ����
		   abc...(�ı���)
		   abc...(ģʽ��)
		   ���룺(��ס������ģʽ���ĳ���>=�ı�������ֻҪ�����ı��Ƿ�Խ�����)
		  if((s<str.length&&str[s]==pattern[p])||(pattern[p]=='.'&&s<str.length)) {
			  return matchRecur(str, pattern, s+1, p+1);
		  } */
		if ((s<str.length&&str[s]==pattern[p])||(s<str.length&&pattern[p]=='.')) {
			return matchRecur(str, pattern, s+1, p+1);
		}
		
		/*2����ģʽ�еڶ����ַ��� * ʱ�������������������Ҫ������
		��1������ab��c*ab
		  ��һ���ַ�����ȣ�һ��aһ��c����ģʽ���ڶ���* ��ֱ��patten���������ָ�룺
		    return matchRecur(str, pattern, s, p+2);
	     ����һ���ַ����ʱ�ˣ������������Ҫ����������
	       1��abc��a*bc  ģʽ����2�ַ�,�ı�����1�����൱��*������  matchRecur(str, pattern, s+1, p + 2)
	       2��abc��a*abc ģʽ����2�ַ����൱��x*�����ԣ�matchRecur(str, pattern, s, p + 2)
	       3��aaaabc��a*abc �ַ�������1�ַ���ģʽ���䣬������ƥ���ַ���һλ����Ϊ*����ƥ���λ��matchRecur(str, pattern, s+1, p)*/
		
		if (p<pattern.length-1&&pattern[p+1]=='*') {
			if ((s<str.length&&str[s]==pattern[p])||(s<str.length&&pattern[p]=='.')) {
				//����������ֻ���и�Ϊ�棬���У���Ϊ������������������
				return matchRecur(str, pattern, s+1, p + 2)||
						matchRecur(str, pattern, s, p + 2)||
						matchRecur(str, pattern, s+1, p);
						
			}else {
				return matchRecur(str, pattern, s, p+2);
				
			}
		}
		
		
		
		return false;
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
