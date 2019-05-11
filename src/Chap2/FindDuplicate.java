package Chap2;

import java.util.Arrays;
/**
 * ��һ������Ϊn����������������ֶ���0��n-1�ķ�Χ�ڡ� ������ĳЩ�������ظ��ģ�����֪���м����������ظ��ġ�Ҳ��֪��ÿ�������ظ����Ρ����ҳ�����������һ���ظ������֡�
 * ���磬������볤��Ϊ7������{2,3,1,0,2,5,3}����ô��Ӧ������ǵ�һ���ظ�������2����3��
 */
public class FindDuplicate {
	 /**����һ��
     * �Ƚ���������������ظ�Ԫ�ؽ������ڡ�Ȼ������Ԫ�������Ƚϼ���
     * @param numbers �����ҵ�����
     * @param length ����ĳ��ȣ���ʵ����numbers.length
     * @param duplication �������ڱ����ظ����֣���һ�����ҵ����ظ����ִ����duplication[]��
     * @return ��������������ظ�Ԫ��
     */
	public boolean duplicate1(int numbers[],int length,int [] duplication) {
		if (numbers==null || length==0) {
			return false;
		}
		Arrays.sort(numbers);
		for(int i=0;i<length-1;i++) {
			if(numbers[i]==numbers[i+1]) {
				duplication[0]=numbers[i];
			return true;
			}
		}
		return false;
	}
    /**
     * �Ƽ���������ͨ������Ԫ�أ���ֵi���浽numbers[i]
     * ��numbers[i]����i���ʱ�����numbers[i]��numbers[numbers[i]]��Ⱦ�˵���ظ�Ԫ�أ�
     * ����ͽ���������Ԫ�أ���������൱�����򡣾ٸ����ӣ�ͨ��������2����numbers[2]��
     */
	private void swap(int[] numbers,int p,int q ) {
		int temp=numbers[p];
		numbers[p]=numbers[q];
		numbers[q]=temp;
		
	}
	public boolean duplicate2(int numbers[],int length,int[] duplicate) {
		//�ж�Ϊ���鲻���ڻ��߳���Ϊ0 ���˳�
		if (numbers==null|| length<=0) {
			return false;
		}
		for(int i=0;i<length;i++) {
			
			if(numbers[i]<0||numbers[i]>length-1) {
				return false;
			}
		}
		/*
		 * ��ѭ��n�Σ�Ȼ��while�ڲ� �൱������һ�����򣬽�ԭ����mλ���ϵ�������mλ���ϣ�
		 * �����λ�õ���ѭ��һ�Ρ�
		 * ��������2.3.1.0.2.5.3��
		 * ��һ��for_i=0:
		 * [1.3.2.0.2.5.3]
		 * [3.1.2.0.2.5.3]
		 * [0.1.2.3.2.5.3]
		 * �ڶ�for_i=1
		 * [0.1.2.3.2.5.3]
		 * ������for_i=2
		 * [0.1.2.3.2.5.3]
		 * ���Ĵ�for_i=3
		 * [0.1.2.3.2.5.3]
		 * �����for_i=4
		 * [0.1.2.3.2.5.3]
		 * return true;���ظ�ֵ2
		 * ����ѭ����������һ��
		 * �����for_i=5
		 * [0.1.2.3.2.5.3]
		 * ������for_i=6
		 * [0.1.2.3.2.5.3]
		 * return true;���ظ�ֵ2
		 * ����ѭ����������һ��
		 * */
		for(int i=0;i<length;i++) {	
			while (numbers[i]!=i) {
				if(numbers[i]==numbers[numbers[i]]) {
					duplicate[0]=numbers[i];
					return true;
				}
				swap(numbers, i, numbers[i]);
			}
	
		}
		
		return false;
	}
}
