package Chap2;

/**
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。假设输入的数组的任意两个数字都互不相同。
 */
public class verifySquenceOfBST {
	public Boolean verifySquenceOfBST(int[] sequence) {
		if(sequence==null||sequence.length==0)
			return false;
		if(isSearchBT(sequence,0,sequence.length-1)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		return isSearchBT(sequence,0,sequence.length-1);
	}
	public boolean isSearchBT(int[] seq,int begin,int end) {
		if(begin>=end) {
			return true;
		}
		int rootval=seq[end];//后序遍历的最后一个结点为根结点
		//在二叉搜索树中左子树的结点小于根结点
		int i=begin;
		for(;i<end;i++){
			if(seq[i]>rootval) {
				break;
			}
			
		}
		//在二叉搜索树中右子树的结点大于根结点
		int j=i;
		for(;j<end;j++) {
			if(seq[j]<rootval) {
				return false;
			}
		}
		//判断左子树是不是二叉树
		boolean left=true;
		if (i>begin) {
			left=isSearchBT(seq, begin, i--);
		}
		//判断右子树是不是二叉树
		boolean right=true;
		if (i<end) {
			right=isSearchBT(seq, i, end-1);
		}
		return(left&&right);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
