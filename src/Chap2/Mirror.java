package Chap2;

public class Mirror {
	public class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;

	    public TreeNode(int val) {
	        this.val = val;

	    }

	}
	public void Mirror(TreeNode root) {
		if (root==null) {
			return;
		}else {
			TreeNode node=root.left;
			root.left=root.right;
			root.right=node;
		}
		Mirror(root.left);
		Mirror(root.right);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
