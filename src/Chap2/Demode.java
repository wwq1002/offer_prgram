package Chap2;
public class Demode {
	public static String removeRepeatChar(String s) {//找到第一个相邻的数字删除并返回剩下的字符串
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
	 public static Boolean NN(String s) {//判断数组是否有相邻且相同的数字，有的话则返回true，没有的话则返回false
		      int i = 0;
		      int len = s.length();
		        while (i < len) {
		            if(i+1< len && s.charAt(i) == s.charAt(i+1)) {//这个是如果这两个值相等，就让i+1取下一个元素
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
        while(NN(str)==true) {//当有相邻且相同的字符串的时候就继续，知道没有相邻且相同的字符串就结束
    	   String str_2=removeRepeatChar(str);
    	   NNIU++;
    	   str=str_2;
       }
     if (NNIU%2==0) {//执行了偶数次则是妞妞赢
		System.out.println("no!");
	}else {//执行奇数次则是牛牛赢
		System.out.println("win!");
	}
}

}
