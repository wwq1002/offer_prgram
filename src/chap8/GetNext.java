package chap8;

import java.util.LinkedList;

/*给定一个二叉树和其中的一个结点，请找出中序遍历顺序的下一个结点并且返回。
 *注意，树中的结点不仅包含左右子结点，同时包含指向父结点的指针。
*/
class TreeLinkNode {
    int val;
    TreeLinkNode left = null;
    TreeLinkNode right = null;
    TreeLinkNode next = null;
    TreeLinkNode(int val) {
        this.val = val;
    }
}
public class GetNext {
	public TreeLinkNode GetNext(TreeLinkNode pNode)
	 {
		//如果当前结点右子树不空，那么中序下一个节点就是右子树的最左节点；如果右子树没有左子树就直接返回右子树根节点
		if (pNode.right!=null) {
			pNode=pNode.right;
			while(pNode.left!=null) {
				pNode=pNode.left;
			}
			return pNode;
		}
		
		//右节点不为空的两种情况
		//1、
		//如果父节点的右节点当前的节点，继续返回到上层的父节点...直到父节点左子节点等于当前节点，找左子树的最右节点
		while (pNode.next!=null&&pNode.next.right==pNode) {
			pNode=pNode.next;
		}
		//2、
		//如果右子树为空，返回上层父节点
		return pNode.next;
		
		
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
