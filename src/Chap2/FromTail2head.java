package Chap2;
/**
 * 输入一个链表的头节点，从尾到头打印链表每个节点的值。
 */

import java.util.ArrayList;
import java.util.LinkedList;
public class FromTail2head {
	//节点类的定义
	private class ListNode {
		int val;
		ListNode next=null;
		public ListNode(int val) {
			this.val=val;
		}
	}
	/**
	 * 方法一：正序压入，逆序弹出
	 * @param listNode 链表的头结点
	 * @return 从头到尾列的节点
	 */
	public ArrayList<Integer> printListFromTailToHead(ListNode listNode){
		LinkedList<Integer> stack=new LinkedList<>();
		for(ListNode node=listNode;node!=null;node=node.next) {
			stack.push(node.val);
		}
		return new ArrayList<Integer>(stack);
	}
	/**
	 * 方法二：利用递归
	 * 先递归到最后一个节点开始依次犯规，列表如果很长不适合递归，深度将很大
	 */
	private ArrayList<Integer> a = new ArrayList<>();
	public ArrayList<Integer> printListFromTailToHead2(ListNode listNode) {
		if(listNode!=null) {
			printListFromTailToHead(listNode.next);
			a.add(listNode.val);
		}
		return a;
	}
}
