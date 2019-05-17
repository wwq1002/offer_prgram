package chap8;

import java.util.LinkedList;

/*在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，
重复的结点不保留，返回链表头指针。 例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
*/
public class deleteDuplication {
	public static ListNode deleteDuplication(ListNode pHead)
	    {
			if (pHead==null&&pHead.next==null) {
				return pHead;
			}
			// 当前结点的前一个结点
	        ListNode pre = null;
	        // 当前结点
	        ListNode cur = pHead;
			while (cur!=null&&cur.next!=null) {
					if (cur.val==cur.next.val) {
						int val=cur.val;
						
						while(cur!=null&&(cur.val==val)) {
							cur=cur.next;
						}
						if (pre==null) {
							pHead=cur;
						}else {
							pre.next=cur;
					}
					}else {
						 	pre = cur;
			                cur = cur.next;
					}
				}
					return pHead;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode listNode01=new ListNode(1);
		ListNode listNode02=new ListNode(2);
		ListNode listNode03=new ListNode(3);
		ListNode listNode04=new ListNode(3);
		ListNode listNode05=new ListNode(4);
		ListNode listNode06=new ListNode(5);
		listNode01.next=listNode02;
		listNode02.next=listNode03;
		listNode03.next=listNode04;
		listNode04.next=listNode05;
		listNode05.next=listNode06;
		System.out.println(deleteDuplication(listNode01));
	}

}
