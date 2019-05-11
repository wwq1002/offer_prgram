package Chap2;

import java.util.Collections;
import java.util.ArrayList;

public class Tencent {
	public static void Shu(int N,int k) {
		ArrayList<Integer> shu=new ArrayList<>();
		shu.add(N);
		int count=0;
		int n=0;
		while(k>=Math.pow(2, n)) {
			k=(int) (k-Math.pow(2, n));
			int size=shu.size();
			for(int i=0;i<size;i++) {
				if(shu.get(i)%2==0) {
					shu.set(i,shu.get(i)/2);
					shu.add(shu.get(i));
				}else {
					shu.set(i, shu.get(i)/2);
					shu.add(shu.get(i)+1);
				}
				
			}
			n+=1;
			count+=1;
		}
		int Max = Collections.max(shu); 
		System.out.println(count+Max);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shu(5,2);
	}

}
