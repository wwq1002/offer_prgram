package Chap2;
//��ʵ��һ����������һ���ַ����е�ÿ���ո��滻�ɡ�%20����
//���磬���ַ���ΪWe Are Happy.�򾭹��滻֮����ַ���ΪWe%20Are%20Happy��
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
