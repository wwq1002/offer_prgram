package Chap2;/*
我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
这个题和跳青蛙的那个是一致的，f(n)=f(n-1)+f(n-2)
f(1)=1,f(2)=2;f(3)=f(2)+f(1);*/
public class RectCover {
	public static int RectCover(int target) {
		if (target==0) {
			return 0;
		}
		if (target==1) {
			return 1;
		}
		if (target==2) {
			return 2;
		}
		return RectCover(target-1)+RectCover(target-2);
		
	}
	public static void main(String[] args) {
		int a=RectCover(2);
		System.out.println(a);
	}

}
