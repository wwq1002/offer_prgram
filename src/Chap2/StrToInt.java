package Chap2;

/*��һ���ַ���ת����һ������(ʵ��Integer.valueOf(string)�Ĺ��ܣ�����string������
����Ҫ��ʱ����0)��Ҫ����ʹ���ַ���ת�������Ŀ⺯���� ��ֵΪ0�����ַ�������һ���Ϸ�����ֵ�򷵻�0��
*/
//jiang��һ���ַ���ת����һ������
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
