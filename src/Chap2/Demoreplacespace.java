package Chap2;
//请实现一个函数，将一个字符串中的每个空格替换成“%20”。
//例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
public  class Demoreplacespace {
	 
	public static void main(String[] args) {
		String str="";
		Demoreplacespace newobject=new Demoreplacespace();
		String strarr="we are happy";
		StringBuffer stringBufferone=new StringBuffer(strarr);
		String acc=replaceSpace(stringBufferone);
		System.out.println(acc);
		
	}
	   public static String replaceSpace(StringBuffer str) {
	    	return str.toString().replaceAll(" ", "%20");
	    }

}
