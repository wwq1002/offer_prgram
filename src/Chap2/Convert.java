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
	//˫����������ͷ�����ұ�ͷ�ڵ�
	 TreeNode leftHead=null;
     TreeNode rightHead=null;
     //����leftHead��Ϊ��ߵ�ͷ��㣬rightHead��Ϊָ��
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
