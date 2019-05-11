package Chap2;

public class Deomone {
	 static public boolean Find(int target, int [][] array) {
        if(array!=null && array.length>0){
            //int high=array[0].length-1;
            for(int i=0;i<array.length;i++){
                int low=0;
                int high=array[0].length-1;
                while(low<=high){
                    int mid=(low+high)/2;
                   if(target>array[i][mid]){
                        low=mid+1;
                   }else if(target<array[i][mid]){
                	   	high=mid-1;
                    }else{
                        return true;
                }
            }            
        }
            return false;
    }
    	return false;   
}	    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array_list={{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
		int a=7;
		System.out.println(Find(a,array_list));
	}

}
