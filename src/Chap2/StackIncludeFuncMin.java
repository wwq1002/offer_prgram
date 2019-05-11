package Chap2;

import java.util.LinkedList;

public class StackIncludeFuncMin {
	/**
	 * ʵ��ջ�����ݽṹ������min����������O(1)��ʱ�临�ӶȻ��ջ�е���Сֵ
	 */
	/*
	�������pop��peek������
	��ͬ�㣺������ջ����ֵ��
	��ͬ�㣺peek ���ı�ջ��ֵ(��ɾ��ջ����ֵ)��pop���ջ����ֵɾ����
	*/
	 private LinkedList<Integer> stack=new LinkedList<>();
	 private LinkedList<Integer> stackMin=new LinkedList<>();
	 public void push(int node) {
	      stack.push(node);
	      if(stackMin.isEmpty()||node<stackMin.peek()) {
	    	  stackMin.push(node);
	      }else {
	    	  stackMin.push(stackMin.peek());
	    	  
	      }
	    }
	    
	    public void pop() {
	        if(stack.isEmpty()) {
	        	throw new RuntimeException("stack is empty!");
	        }
	        stack.pop();
	        stackMin.pop();
	        
	    }
	    
	    public int top() {
	    	 if (stack.isEmpty()) {
	             throw new RuntimeException("stack is empty!");
	         }
	         return stack.peek();
	    }
	    
	    public int min() {
	    	 if (stackMin.isEmpty()) {
	             throw new RuntimeException("stack is empty!");
	         }
	         return stackMin.peek();
	    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
