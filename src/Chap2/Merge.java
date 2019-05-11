package Chap2;

import Chap2.ReverseList.ListNode;

public class Merge {
	
//第一种 将两个链表合并成一个链表，然后依次比较大小，最后成一个单调不减链表	
//第二种 依次作比较
	
public ListNode Merge(ListNode list1,ListNode list2) {
        /*ListNode node_11=null;*/
        //ListNode node_33=null;
	 if (list1 == null) {
         return list2;
     }
     if (list2 == null) {
         return list1;
     }
		ListNode p1 = list1;
	    ListNode p2 = list2;
	    ListNode head = null;
	    // 两个链表中哪个头结点的值小，就以此作为新链表的头结点
	    if (p1.val <= p2.val) {
	        head = p1;
	        p1 = p1.next;
	    } else {
	        head = p2;
	        p2 = p2.next;
	    }
	
	    ListNode cur = head;
        for(ListNode node_1=p1;node_1!=null;) {
        	for(ListNode node_2=p2;node_2!=null;) {
        		if(node_1.val<node_2.val) {
        			cur.next=node_1;
        			cur=cur.next;
        			node_1=node_1.next;
            		break;
        		}else {
        			cur.next=node_2;
        			cur=cur.next;
        			node_2=node_2.next;
        			continue;
        		}
        	}
        	cur.next=null;     	
        }     	
        return head; 	
        }
       
       
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
