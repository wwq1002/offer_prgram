package Chap2;


import java.util.LinkedList;
public class ReverseList {

	public class ListNode {
	    int val;
	    ListNode next = null;

	    ListNode(int val) {
	        this.val = val;
	    }
	}
  public ListNode ReverseList(ListNode head) {
	  if(head==null) {
		  return null;
	  }
        //考虑用栈来实现
	  LinkedList<ListNode> stack_revert=new LinkedList<ListNode>();
	  ListNode cur=head;
	  int count=0;
	  while(cur!=null) {
		  stack_revert.push(cur);
		  cur=cur.next;
	  }
	  head=stack_revert.pop();
	  cur=head;
	  while(!stack_revert.isEmpty()) {
		  cur.next=stack_revert.pop();
		  cur=cur.next;
	  }
	  cur.next=null;
	  return head;
		  
	  }
	  
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	}

}
