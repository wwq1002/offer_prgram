package Chap2;/*
���ǿ�����2*1��С���κ��Ż�������ȥ���Ǹ���ľ��Ρ�������n��2*1��С�������ص��ظ���һ��2*n�Ĵ���Σ��ܹ��ж����ַ�����
�����������ܵ��Ǹ���һ�µģ�f(n)=f(n-1)+f(n-2)
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
