package Chap2;

public class InversePairs {
	 public static int InversePairs(int [] array) {
		 if (array.length==0||array==null) {
			return 0%1000000007;
		}
		 int p=0;
	      for (int i = 0; i < array.length; i++) {
			int j=i;
			int waitinsert=array[i];
			while (j>0&& waitinsert<array[j-1]) {
				array[j]=array[j-1];
				j--;
				p++;
			}
			array[j]=waitinsert;
		} 
		 
		 return p%1000000007; 
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] a = {627126,415347,850134,371085,279048,705820,453064,944751,92317,58592,167988,284065,992573,78043,190215,104546,607528,391775,701214,849731,231053,603058,975374,199773,479544,143961,206797,325662,90035,69615,429916,717161,484962,796403,604598,280362,502223,57662,741466,594540,632606,909454,394957,625180,503849,585172,729726,627729,976947,947293,477461,724352,66703,452835,440478,62599,596797,163627,388261,203184,233243,334529,436697,234557,647284,41295,514920,665859,615310,256386,776752,247916,682192,171709,389448,186041,273234,635527,813771,766533,582820,807584,490886,649523,260419,447716,228474,373568,611343,616735,576752,844586,467616,529801,595496,631253,571097,110416,297112,186407,883154,73864,950675,81698,245574,340124,267739,35160,975651,597862,801693,74823,921798,292579,240698,182218,256647,469172,72138,867991,602259,165243,228929,69875,695044,824425,701128,782493,451193,998241,485252,334347,588457,435928,
				 416045,350383,292404,200137,385543,268055,314351,187237,859230,236150,996168,99928,9347};
	  System.out.println(InversePairs(a));
		
	
	}

}
