package Chap2;
public class Demode {
	public static String removeRepeatChar(String s) {//�ҵ���һ�����ڵ�����ɾ��������ʣ�µ��ַ���
		 if (s == null) {
	        	return "";
	        }
		    StringBuffer sb = new StringBuffer();
	        int i = 0;
	        int len = s.length();
	        int flag=0;    
	        if(len==1) {
	        	return s;
	        }
	        if(len==2) {
	        	if (s.charAt(0)==s.charAt(1)) {
					return "";
				}else
					return s;
	        	
	        }     
	        while (i < len) {
	            char c = s.charAt(i); 
	            sb.append(c);  	
	            	i++;
	             if(flag==0) {
	            	 while (i < len && s.charAt(i) == c) {
	                    sb.delete(i-1,i);
	 	                i++;
	 	                flag=1;
	 	                break;
	 	            }   
	             }
			}
	            
	        return sb.toString();
	    }
	 public static Boolean NN(String s) {//�ж������Ƿ�����������ͬ�����֣��еĻ��򷵻�true��û�еĻ��򷵻�false
		      int i = 0;
		      int len = s.length();
		        while (i < len) {
		            if(i+1< len && s.charAt(i) == s.charAt(i+1)) {//��������������ֵ��ȣ�����i+1ȡ��һ��Ԫ��
		                return true;
		            }else {
		            	i++;
		            }
		        }
				return false;
	}
	
	public static void main(String[] args) {
		String str="1100";
        int NNIU=0; 
        while(NN(str)==true) {//������������ͬ���ַ�����ʱ��ͼ�����֪��û����������ͬ���ַ����ͽ���
    	   String str_2=removeRepeatChar(str);
    	   NNIU++;
    	   str=str_2;
       }
     if (NNIU%2==0) {//ִ����ż����������Ӯ
		System.out.println("no!");
	}else {//ִ������������ţţӮ
		System.out.println("win!");
	}
}

}
