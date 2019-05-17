import java.util.Scanner;

/*题目描述 
给出一组正整数，你从第一个数向最后一个数方向跳跃，
每次至少跳跃1格，每个数的值表示你从这个位置可以跳跃的最大长度。计算如何以最少的跳跃次数跳到最后一个数。
*/

/*解题思路：如何选择步长是关键。 
我的解题思路过程如下： 
(1)把最后一个数当作终点，从最后一个数开始，往前找，找到一个可以一步到达终点且距离终点最远的那个数； 
(2)把刚刚找到的数，作为终点，重复(1)的步骤 
(3)到达起点的数时，就终止。
*/

public class JumpGame {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int[] num = {2,3,2,1,2,1,5};
	        for (int i = 0; i < n; i++)
	            num[i] = sc.nextInt();
	        sc.close();
	        System.out.println(jump(n, num));
	
	}
	public static int jump(int n,int[] num) {
		int count=0;
		int start=0;
		int end=n-1;
		int temp=0;
		while(end!=start){
			for (int i = 0; i <=end; i++) {
				if (num[end]-1==num[start]) {
					count++;
					end=start;
					break;
				}

				if ((num[i]+i)==end) {
					 temp=i;
					 count++;
					 end=temp;
					 break;
				}
			}
			
		}
		
		return count;
	}

}
