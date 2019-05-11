package Chap2;

import java.util.LinkedList;

public class IsPopOrder {
	/**
	 * ���������������У���һ�����б�ʾջ��ѹ��˳�����жϵڶ��������Ƿ�Ϊ��ջ�ĵ���˳��
	 * ����ѹ��ջ���������־�����ȡ���������1,2,3,4,5��ĳջ��ѹ��˳������4,5,3,2,1�Ǹ�ѹջ���ж�Ӧ��һ���������У�
	 *  ��4,3,5,1,2�Ͳ������Ǹ�ѹջ���еĵ�������
	 * ��ע�⣺���������еĳ�������ȵģ�
	 */
	public static boolean IsPopOrder(int [] pushA,int [] popA) {
	      LinkedList<Integer> stackAux=new LinkedList<>();
	      if (pushA==null||popA==null||pushA.length==0||popA.length==0) {
			return false;
		}/*
			˼·����ջ֮�󣬸��ݳ�ջ��˳����һ�飬��ô����վӦ��Ϊ�գ���Ȼ�Ͳ�����ȷ�ĳ�ջ
	      */
	      int popIndex = 0;
	      for(int i=0;i<pushA.length;i++) {
	    	  stackAux.push(pushA[i]);
	    	  while(!stackAux.isEmpty()&&stackAux.peek()==popA[popIndex]) {
	    		  stackAux.pop();
	    		  popIndex++;
	    	  }
	      }
	      if (stackAux.isEmpty()) {
			return true;
		}else {
			return false;
		}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={1,2,3,4,5};
		int[] b={4,5,3,2,1};
		int[] c={4,3,5,1,2};
		boolean is_=IsPopOrder(a,b);
		boolean is_not=IsPopOrder(a,c);
		System.out.println(is_);
		System.out.println(is_not);
	}

}
