package Chap2;

import java.util.Stack;

public class FindFirstCommonNode {
	public class ListNode {
	    int val;
	    ListNode next = null;

	    ListNode(int val) {
	        this.val = val;
	    }
	}
	public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
		if (pHead1.next==null||pHead2==null) {
			return null;
		}
		Stack<ListNode> stack_1=new Stack<>();
		Stack<ListNode> stack_2=new Stack<>();
		Stack<ListNode> stack_3=new Stack<>();
		ListNode temp_1=pHead1;
		ListNode temp_2=pHead2;
		while (temp_1!=null) {
			stack_1.push(temp_1);
			temp_1=temp_1.next;
		}
		while (temp_2!=null) {
			stack_2.push(temp_2);
			temp_2=temp_2.next;
		}
		
		while (!stack_1.isEmpty()&&!stack_2.isEmpty()) {
			ListNode temp_11=stack_1.peek();
			ListNode temp_22=stack_2.peek();
			if (temp_11==temp_22) {
				stack_3.push(temp_11);
				stack_1.pop();
				stack_2.pop();
			}else {
				break;
			}
		}
		if (stack_3.isEmpty()) {
			return null;  
		}else {
			return stack_3.pop();
		}
		
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
