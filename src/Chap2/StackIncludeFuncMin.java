package Chap2;

import java.util.LinkedList;

public class StackIncludeFuncMin {
	/**
	 * 实现栈的数据结构，包含min方法可以以O(1)的时间复杂度获得栈中的最小值
	 */
	/*
	关于这个pop和peek的区别：
	相同点：都返回栈顶的值。
	不同点：peek 不改变栈的值(不删除栈顶的值)，pop会把栈顶的值删除。
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
