package chap8;
/*
请实现一个函数，用来判断一颗二叉树是不是对称的。注意，
如果一个二叉树同此二叉树的镜像是同样的，定义其为对称的。*/
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }
}
public class isSymmetrical {
	
	boolean isSymmetrical(TreeNode pRoot)
    {
			if (pRoot==null) {
				return true;
			}
			return isSymmetrical0(pRoot.left,pRoot.right);
	
    }
	boolean isSymmetrical0(TreeNode root1,TreeNode root2) {
		if (root1==null&&root2==null) {
			return true;
		} 
		if (root1==null||root2==null) {
			return false;
		}
		if (root1.val!=root2.val) {
			return false;
		}
		return isSymmetrical0(root1.left, root2.right)
                && isSymmetrical0(root1.right, root2.left);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
