package chap8;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*
 * 请实现一个函数按照之字形打印二叉树，
 * 即第一行按照从左到右的顺序打印，第二层按照从右至左的顺序打印，第三行按照从左到右的顺序打印，其他行以此类推。
*/
class TreeNode01 {
    int val = 0;
    TreeNode01 left = null;
    TreeNode01 right = null;

    public TreeNode01(int val) {
        this.val = val;

    }

}
//层次遍历的思想
public class Print {
	public ArrayList<ArrayList<Integer> > Print(TreeNode01 pRoot) {
		ArrayList<ArrayList<Integer>> aLists=new ArrayList<>();
		//如果根节点不存在，则返回null
		if (pRoot==null) {
			return aLists;
		}

		//层次遍历,队列
		Queue<TreeNode01> queue=new LinkedList<>();
		Stack<TreeNode01> stack=new Stack<>();
		int depth=1;//默认根为第一层，为单层
		queue.offer(pRoot);
		while (!queue.isEmpty()) {			
			ArrayList<Integer> blList=new ArrayList<>();
			if (depth%2==0) {//层数为双
				int size=queue.size();
				for (int i = 0; i < size; i++) {
					TreeNode01 node=queue.poll();//弹出当前树节点
					stack.push(node);
					if (i==size-1) {
						while (!stack.empty()) {//栈判断为空的条件和队列判断为空的条件是不一样的，
							blList.add(stack.pop().val);
						}
					}
					if (node.left!=null) {
						queue.offer(node.left);
					}
					if (node.right!=null) {
						queue.offer(node.right);
					}
					
				}
			}else {//层数为单
				int size=queue.size();
				for (int i = 0; i < size; i++) {
					TreeNode01 node=queue.poll();//弹出当前树节点
					blList.add(node.val);
					if (node.left!=null) {
						queue.offer(node.left);
					}
					if (node.right!=null) {
						queue.offer(node.right);
					}
				}
			}
			
			aLists.add(blList);
			depth++;
		}
		return aLists;
	   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
