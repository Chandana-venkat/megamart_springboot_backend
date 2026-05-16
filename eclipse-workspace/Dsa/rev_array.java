//package target;
//
//public class rev_array {
//	public static void main(String[] args) {
//		int arr[]= {1,2,3,4}; //arr.length -1 for reverse
//		System.out.println("reverse array is : ");
//		for(int i=arr.length-1;i>=0;i--) {
//			System.out.println(arr[i]+ " ");
//			
//		}
//	}
//
//}

//16/4/26
//find the max element even array
//package target;
//public class rev_array{
//	public static void main(String[] args) {
//	int arr[]= {1,2,3,4};
//	int max=0;
//	for(int i=0;i<arr.length;i++) {
//		if(arr[i]>max) {
//		  max=arr[i];
//		}
//	}
//	System.out.println("max element: "+max);
//  }	
//}
//package target;
//public class rev_array{
// public static int findmax(int[] arr){
//	 int max=arr[0];
//	 for(int i=0;i<arr.length;i++) {
//		 if(arr[i]>max) {
//			 max=arr[i];
//			 
//		 }
//	 
//	 }
//	 return max;
// }
// public static void main(String [] args) {
//	 int arr[] = {12,89,37,28,19,93};
//	 //callimh method to find maxumum
//	 System.out.println("Maximum element :"+rev_array.findmax(arr));
//  }
//}
//package target;
//public class rev_array{
// public static int findmin(int[] arr){
//	 int min=arr[0];
//	 for(int i=0;i<arr.length;i++) {
//		 if(arr[i]<min) {
//			 min=arr[i];
//		 }
//	 }
//	 return min;
// }
// public static void main(String [] args) {
//	 int arr[]= {12,89,37,28,19,93};
//	 System.out.println("Minimum element :"+rev_array.findmin(arr));
//  }
//}
//package target;
//public class rev_array{
//	 public static void main(String [] args) {
//		int arr[] = {12,89,37,28,19,93};
//		int min=arr[0];
//		int max=arr[0];
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]>max) {
//				max=arr[i];
//			}
//			if(arr[i]<min) {
//				min=arr[i];
//			}
//		}
//		System.out.println(min +" "+max);
//		//System.out.println(max);
//	 }
//}

//package target;
//public class rev_array{
//	public static void main(String[] args) {
//		int arr [] []= {{12,89,45},{23,83,29},{73,98,74}};//remove 45
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr[i].length;j++) { //to find length for jagged array
//				System.out.print(arr[i][j]+ " "); //ln 12
//			}                                       // 89 we want row so that only print
//			System.out.println();
//		}
//	}
//}

//12 89
//23 83 29
//73 98 74

//count how many elements equal to the minium value in the array; means {2,1,3,4,1,6,1} so 1=3mininum count
//package target;
//public class rev_array{
//	public static void main(String[] args) {
//		int arr[]= {1,45,12,16,1,12};
//		int min=arr[0];
//		int count=1;
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]<min) {
//				min=arr[i];
//				count=1;
//			//for (int j=0;j<arr.length-1;j--)
//		     }
//			else if(arr[i]==min){
//				count++;
//			}
//	}
//		System.out.println("min  "+ min);	
//		System.out.println("count: " + count);
//			
//		}
//		
//}

//find min and max index(not value) ie return the position where the min/max occur
//package target;
//public class rev_array{
//	public static void main(String[] args) {
//		int arr[]= {1,45,12,16,1,12};
//		int minindex=0;
//		int maxindex=0;
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]<arr[minindex]) {
//				minindex=i;
//				
//			}
//			if(arr[i]>arr[maxindex]);
//			maxindex=i;
//		}
//		
//		System.out.println("Min index: " +minindex );
//		System.out.println("maxindex: " +maxindex);
//		
//	}
//}





//
//import java.util.Arrays;
//
//public class rev_array {
//   public static void main(String[] args){
//	     int cpy[]= {1,2,3,4,6,7,8};
//		//System.out.println(Arrays.toString(nwarr));
//		//copy of range(arr,fi,li) based on the range;
//		int[] nwarr=Arrays.copyOfRange(cpy, 3, 17);
//		System.out.println("new array is :" +Arrays.toString(nwarr));
//		//fill specified values inside array
//		int fnew[]=new int[5];
//		Arrays.fill(fnew, 8);
//		System.out.println("New array: "+Arrays.toString(fnew));
//		
//	}
//}


//package target;
//import java.util.Arrays;
//
//
//public class rev_array {
//    public static void main(String[] args) {
//
//        int cpy[] = {1,2,3,4,6,7,8};
//
//        int[] nwarr = Arrays.copyOfRange(cpy, 3, 7);
//        System.out.println("new array is: " + Arrays.toString(nwarr));
//
//        int fnew[] = new int[5];
//        Arrays.fill(fnew, 8);
//        System.out.println("New array: " + Arrays.toString(fnew));
//    }
//}




































