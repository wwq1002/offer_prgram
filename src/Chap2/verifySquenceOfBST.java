package Chap2;

/**
 * ����һ���������飬�жϸ������ǲ���ĳ�����������ĺ�������Ľ�����������������������������ֶ�������ͬ��
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
		int rootval=seq[end];//������������һ�����Ϊ�����
		//�ڶ������������������Ľ��С�ڸ����
		int i=begin;
		for(;i<end;i++){
			if(seq[i]>rootval) {
				break;
			}
			
		}
		//�ڶ������������������Ľ����ڸ����
		int j=i;
		for(;j<end;j++) {
			if(seq[j]<rootval) {
				return false;
			}
		}
		//�ж��������ǲ��Ƕ�����
		boolean left=true;
		if (i>begin) {
			left=isSearchBT(seq, begin, i--);
		}
		//�ж��������ǲ��Ƕ�����
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
