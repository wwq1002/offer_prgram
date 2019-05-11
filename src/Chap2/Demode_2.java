package Chap2;

public class Demode_2 {
	 public static String removeRepeatChar(String s) {
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="102223345546";
		str=removeRepeatChar(str);
		System.out.println(str);
	}

}
