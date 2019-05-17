package chap8;
import java.util.*;
public class primTree {
	static int MAX = Integer.MAX_VALUE;
	public static void main(String[] args) {
		//定义无向图矩阵
		int[][] map = new int[][] {
				{ 0, 1, 6, 2},
				{ 1, 0, 3, 2},
				{ 6, 3, 0, 1},
				{ 2, 2, 1, 0}
				};
		prim(map, map.length);
	}
	public static void prim(int[][] graph, int n){
			//定义节点名字
	        char[] c = new char[]{'A','B','C','D'};        
	        int[] lowcost = new int[n];  //到新集合的最小权 
	        int[] mid= new int[n];//存取前驱结点
            List<Character> list=new ArrayList<Character>();//用来存储加入结点的顺序
	        int i, j, min, minid , sum = 0;
	        //初始化辅助数组
	        for(i=1;i<n;i++)
	        {
	        	lowcost[i]=graph[0][i];
	        	mid[i]=0;
	        }
	        list.add(c[0]);
            //一共需要加入n-1个点，因为第一个节点已经加入到了list中，
	        //所以我们只需要将剩余的依次加入就行，下面的for循坏也就是从1开始，而不是从0开始。
	        for(i=1;i<n;i++)
	        {
	        	 min=MAX;
	        	 minid=0;
	        	 //每次找到距离集合最近的点
	        	 for(j=1;j<n;j++)
	        	 {
	        		 if(lowcost[j]!=0&&lowcost[j]<min)
	        		 {
	        			 min=lowcost[j];//找到那个最近的点
	        			 minid=j;//记录那个最近点的位置
	        		 }
	        	 }
	        	 if(minid==0) return;//当没有找不到时，就说明不存在了
	        	 list.add(c[minid]);
	        	 lowcost[minid]=0;
	        	 sum+=min;
	        	 System.out.println(c[mid[minid]] + "到" + c[minid] + " 权值：" + min);
	        	 //加入该点后，更新其它点到集合的距离
	        	 for(j=1;j<n;j++)
	        	 {
	        		 if(lowcost[j]!=0&&lowcost[j]>graph[minid][j])
	        		 {
	        			 lowcost[j]=graph[minid][j];//将依次加入到字符集合的字符看成一个整体，这一个整体到达外部路径最小的点！
	        			 mid[j]=minid;//这个地方记录这个完全是为了上面输出时候用的，(c[mid[minid]] + "到" + c[minid] + " 权值：" + min)里面的min[minid]了吗？
	        			 
	        		 }
	        	 }
	        	 System.out.print("\n");
	        }
	        System.out.println("sum:" + sum);
	    }
}

