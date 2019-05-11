package Chap2;
import java.util.ArrayList;
/**
 * �����Ϊ9��������������Ϊ������������ָ��pSmall��pBig���ֱ�ָ���������е���β��pSum��ʾ����֮�ͣ�һ��ʼpSmall=1��pBig=2����pSum=3<9��������Ҫ�����������������pBig+1����ʱpSum=6������С��9������pBig+1����ʱpSum=10������9��������Ҫɾ��һЩ����
 * ����pSmall-1��pSum=9���ҵ���һ���������������У�����pBig+1������ǰ��ķ������������������������У�ֱ��pSmall����(s+1)/2.
 * @author wwq
 *
 */
public class FindContinuousSequence {
	/**
	 * ����������������ֺ�
	 * @param small
	 * @param big
	 * @return
	 */
	private static ArrayList<Integer> addFromSmallToBig(int small, int big) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = small; i<= big; i++) {
            list.add(i);
        }
        return list;
    }
	/**
	 * ����ָ���໥Э��
	 * @param sum
	 * @return
	 */
    public static ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
    	ArrayList<ArrayList<Integer>>  list=new ArrayList<>();
    	if (sum<=2) {
			return list;
		}
    	int small=1;
    	int big=2;
    	int curSum=small+big;
    	int mid=(sum+1)/2;
    	while(small<mid) {
    		//ÿ���ж�һ���Ƕ�������sumֵ�ˣ���Ļ����Ǿ�ֻ�ܼ��ˣ����Ļ����Ǿ�ֱ�ӷŵ�small����һλ��Ȼ������ж�
    		while(curSum>sum&&small<mid){
    			curSum-=small;
    			small++;
    		}
    		//��һ���ж��Ƿ���ȣ�������Ⱦͳ������bigֵ�������뵽curSum��
    		if (curSum==sum) {
				list.add(addFromSmallToBig(small,big));
			}
    		//���϶������ϣ��Ǿ���sum��ֵ��С�ˣ������ӣ�
    		big++;
    		curSum+=big;
    	}
    	
    	return list;
 	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<Integer>> list_3=new ArrayList<>();
		list_3=FindContinuousSequence(9);
		for (int i = 0; i < list_3.size(); i++) {
			System.out.println(list_3.get(i));
		}
}
	}

