package Chap2;
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
public class IsBalanced_Solution {
	public boolean IsBalanced_Solution(TreeNode root) {  
	     if (root==null) {
			return true;
		}
	     int left_num=IsBalanced_Solution_1(root.left);
	     int right_num=IsBalanced_Solution_1(root.right);
	     if (Math.abs(left_num-right_num)>1) {
			return false;
		}
	     boolean left=IsBalanced_Solution(root.left);
	     boolean  right=IsBalanced_Solution(root.right);
	     return left&&right;
  }
	
	
	public int IsBalanced_Solution_1(TreeNode root) {
	      if(root==null) {
	    	  return 0;
	      }  
	      int left=IsBalanced_Solution_1(root.left);
	      int right=IsBalanced_Solution_1(root.right);
	      return Math.max(left, right)+1;
	      
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
