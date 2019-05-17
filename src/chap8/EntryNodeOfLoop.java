package chap8;

import java.util.HashMap;
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class EntryNodeOfLoop {
	public static ListNode EntryNodeOfLoop(ListNode pHead)
    {
		HashMap<ListNode, Integer> first=new HashMap<>();
        ListNode pListNode=pHead;
        while (pListNode!=null) {
			if (!first.containsKey(pListNode)) {
				first.put(pListNode, 1);
			}else {
				if (pListNode.next==null) {
					return null;
				}
				return pListNode;
			}
        	pListNode=pListNode.next;
			
		}
	return null;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode listNode=new ListNode(1);
		listNode.next=new ListNode(2);
		listNode.next=new ListNode(3);
		listNode.next=new ListNode(4);
		listNode.next=new ListNode(5);
		listNode.next=new ListNode(3);
		System.out.println(EntryNodeOfLoop(listNode));
	}

}
