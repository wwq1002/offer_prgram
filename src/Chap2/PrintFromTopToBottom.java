package Chap2;
import java.util.ArrayList;



public class PrintFromTopToBottom {
	public class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;
	    public TreeNode(int val) {
	        this.val = val;

	    }

	}
	public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
    ArrayList<TreeNode> treeNodes=new ArrayList<TreeNode>();
    ArrayList<Integer> treeNodes_VAL=new ArrayList<Integer>();
    if(root==null) {
    	return treeNodes_VAL;
    }
    treeNodes.add(root);
    treeNodes_VAL.add(root.val);
    for(int i=0;i<treeNodes.size();i++) {
    	TreeNode node=treeNodes.get(i);
    	if (node.left!=null) {
    		 treeNodes.add(node.left);
    		 treeNodes_VAL.add(node.left.val);
		}
    	if (node.right!=null) {
   		 treeNodes.add(node.right);
   		 treeNodes_VAL.add(node.right.val);
		}
    }
    return treeNodes_VAL;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
