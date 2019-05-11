package Chap2;
import java.util.ArrayList;
/**
 * 以求和为9的所有连续序列为例，假设两个指针pSmall和pBig，分别指向正数序列的首尾，pSum表示序列之和，一开始pSmall=1，pBig=2，，pSum=3<9，序列需要包含更多的数，于是pBig+1，此时pSum=6，依旧小于9，于是pBig+1，此时pSum=10，大于9，序列需要删除一些数，
 * 于是pSmall-1，pSum=9，找到第一个满足条件的序列；接着pBig+1，按照前面的方法继续查找满足条件的序列，直到pSmall等于(s+1)/2.
 * @author wwq
 *
 */
public class FindContinuousSequence {
	/**
	 * 求连续子区间的数字和
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
	 * 两个指针相互协作
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
    		//每次判断一下是都大于了sum值了，大的话，那就只能减了，减的话，那就直接放到small的下一位，然后进行判断
    		while(curSum>sum&&small<mid){
    			curSum-=small;
    			small++;
    		}
    		//第一步判断是否相等，不不相等就持续变大big值，并加入到curSum中
    		if (curSum==sum) {
				list.add(addFromSmallToBig(small,big));
			}
    		//以上都不符合，那就是sum的值很小了，继续加！
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

