package Chap2;
/**
 * ����һ�������ͷ�ڵ㣬��β��ͷ��ӡ����ÿ���ڵ��ֵ��
 */

import java.util.ArrayList;
import java.util.LinkedList;
public class FromTail2head {
	//�ڵ���Ķ���
	private class ListNode {
		int val;
		ListNode next=null;
		public ListNode(int val) {
			this.val=val;
		}
	}
	/**
	 * ����һ������ѹ�룬���򵯳�
	 * @param listNode �����ͷ���
	 * @return ��ͷ��β�еĽڵ�
	 */
	public ArrayList<Integer> printListFromTailToHead(ListNode listNode){
		LinkedList<Integer> stack=new LinkedList<>();
		for(ListNode node=listNode;node!=null;node=node.next) {
			stack.push(node.val);
		}
		return new ArrayList<Integer>(stack);
	}
	/**
	 * �����������õݹ�
	 * �ȵݹ鵽���һ���ڵ㿪ʼ���η��棬�б�����ܳ����ʺϵݹ飬��Ƚ��ܴ�
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
