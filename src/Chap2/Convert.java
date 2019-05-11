package Chap2;

public abstract class Convert {
	public class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;

	    public TreeNode(int val) {
	        this.val = val;

	    }

	}
	//双向链表的左边头结点和右边头节点
	 TreeNode leftHead=null;
     TreeNode rightHead=null;
     //其中leftHead作为左边的头结点，rightHead作为指针
	 public TreeNode Convert(TreeNode pRootOfTree) {
	      if (pRootOfTree==null) {
			return null;
		}
	      Convert(pRootOfTree.left);
	      if (rightHead==null) {
			leftHead=rightHead=pRootOfTree;
		}else {
			rightHead.right=pRootOfTree;
			pRootOfTree.left=rightHead;
			rightHead=pRootOfTree;
		}
	       
	     Convert(pRootOfTree.right);
		 return leftHead;
	    }
	
	
	
	
	public static void main(String[] args) {
		

	}

}
