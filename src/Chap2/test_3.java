package Chap2;

public class test_3 {
	 static void add(Byte b)
    {
        b = b++;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Byte a = 127;
	        Byte b = 127;
	        add(++a);
	        System.out.print(a + " ");
	        add(b);
	        System.out.print(b + "");
	}

}
