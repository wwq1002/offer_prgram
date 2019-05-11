package Chap2;

public class taitaijie {
	 public static int JumpFloor(int target) {
	        if(target<=0){
	            return 0;
	        }
	        if(target==1){
	            return 1;
	        }
	        if(target==2){
	            return 2;
	        }
	        if (target==3) {
				return 4;
			} 	       
	        return JumpFloor(target-1)+JumpFloor(target-2)+JumpFloor(target-3);
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(JumpFloor(15));
	}

}
