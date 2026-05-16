//package target.gt;
//
//public class hh {
//
//	public static void main(String[] args) {
//		String names[] = {"soma", "sanju", "eliya"};
//		String target = "soma";
//		int left = 0;
//		int right = names.length - 1;
//		while (left < right) {
//			int mid = (left + right) / 2;
//			int cmp = names[mid].compareTo(target);
//			if (cmp == 0) {
//				System.out.println("entered");
//				System.out.println("found at:  " + mid);
//				return;
//
//			} else if (cmp < 0) {
//
//				left = mid + 1;
//			} else {
//				right = mid - 1;
//			}
//
//		}
//		System.out.println("element not found");// we have to given in sorted order names
//
//}
//}
//package target.gt;
//public class hh{
//	public static int searchIndex(int arr[],int target) {
//		int left=0;
//		int right=arr.length-1;
//		while(left<=right) {
//			int mid=(left+right)/2;
//			if(arr[mid]==target) {
//				return mid;
//			
//		}else  if(arr[mid]<target) {
//			left=mid+1;
//			
//		}else {
//			right=mid-1;
//		}
//	} 
//		return left;
//	}
//		public static void main(String[] args) {
//			int arr[]= {1,3,5,6,7};
//			int index=searchIndex(arr,2);
//			System.out.println(index);
//		}
//	
//}

//package target.gt;
//
//import java.util.Arrays;
//
//public class hh{
//public static int[] searchRange(int arr[],int target) {
//	   int First=findIndex(arr,target,true);
//	   int last=findIndex(arr,target,false);
//	   return new int[] {First,last};
//	}
//public static int findIndex(int[] arr, int target, boolean  isFirst){
//		// TODO Auto-generated method stub
//		int left=0;
//		int right=arr.length-1;
//		int index=-1;
//		while(left<=right) {
//			int mid=(left+right)/2;
//			if(arr[mid]==target) {
//				index=mid;
//				if(isFirst) {
//					right=mid-1;
//				}
//				else {
//					left=mid+1;
//				}
//			}
//				else if(arr[mid]<target) {
//					left=mid+1;
//				}else {
//					right=mid-1;
//					
//				}
//			}return index;
//		
//		}
//		public static void main(String[] args) {
//			int arr[]= {5,7,7,8,8,10};
//		int	result[]=searchRange(arr, 8);
//			System.out.print(Arrays.toString(result));
//			
//		}
//}






//package target.gt;
//
//import java.util.Arrays;
//
//public class hh {
//
//    public static int[] searchRange(int arr[], int target) {
//        int first = findIndex(arr, target, true);
//        int last = findIndex(arr, target, false);
//        return new int[]{first, last};
//    }
//
//    public static int findIndex(int[] arr, int target, boolean isFirst) {
//        int left = 0;
//        int right = arr.length - 1;
//        int index = -1;
//
//        while (left <= right) {
//            int mid = (left + right) / 2;
//
//            if (arr[mid] == target) {
//                index = mid;
//
//                if (isFirst) {
//                    right = mid - 1; // search left
//                } else {
//                    left = mid + 1;  // search right
//                }
//
//            } else if (arr[mid] < target) {
//                left = mid + 1;
//            } else {
//                right = mid - 1;
//            }
//        }
//
//        return index;
//    }
//
//    public static void main(String[] args) {
//        int arr[] = {5, 7, 7, 8, 8, 10};
//        int[] result = searchRange(arr, 8);
//        System.out.println(Arrays.toString(result));
//    }
//}
//
//
//
//
//package target.gt;
//public class hh {
//public static int binary() {
//        int arr[] = {12, 18, 19, 20, 22};
//        int target = 19;
//        int left = 0;
//        int right = arr.length - 1;
//
//       while (left <= right) {
//            int mid = (left + right) / 2;
//
//            if (arr[mid] == target) {
//              System.out.println("Found element at index: " + mid);
//               return mid;
//           } else if (arr[mid] < target) {
//               left = mid + 1;
//            } else {
//               right = mid - 1;
//            }
//        }
//
//       return -1; // if not found
//   }
//    public static void main(String[] args) {
//        int result = binary();
//
//        if (result == -1) {
//            System.out.println("Element not found");
//}  
//    }
//}
//
//
//
//package target.gt;
//public class hh {
//    
//    public static void main(String[] args) {
//        int[] arr = {2, 4, 10, 10, 10, 18, 20};
//        int target = 10;
//
//        int first = findIndex(arr, target, true);
//        int last = findIndex(arr, target, false);
//
//        int count = (first == -1) ? 0 : last - first + 1;
//
//        System.out.println("First Occurrence: " + first);
//        System.out.println("Last Occurrence: " + last);
//        System.out.println("Count: " + count);
//    }
//
//    static int findIndex(int[] arr, int target, boolean isFirst) {
//        int left = 0, right = arr.length - 1;
//        int index = -1;
//
//        while (left <= right) {
//            int mid = (left + right) / 2;
//
//            if (arr[mid] == target) {
//                index = mid;
//                if (isFirst) {
//                    right = mid - 1; // move left
//                } else {
//                    left = mid + 1;  // move right
//                }
//            } else if (arr[mid] < target) {
//                left = mid + 1;
//            } else {
//                right = mid - 1;
//            }
//        }
//        return index;
//    }
//}

//package target.gt;
//public class hh {
//
//    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 1};
//
//        int peakIndex = findPeak(arr);
//
//        System.out.println("Peak Index: " + peakIndex);
//        System.out.println("Peak Element: " + arr[peakIndex]);
//    }
//
//    public static int findPeak(int[] arr) {
//        int left = 0;
//        int right = arr.length - 1;
//
//        while (left < right) {
//            int mid = (left + right) / 2;
//
//            if (arr[mid] < arr[mid + 1]) {
//                // move right
//                left = mid + 1;
//            } else {
//                // move left (including mid)
//                right = mid;
//            }
//        }
//
//        return left; // or right (both same)
//    }
//}
//package target.gt;
//public class hh {
//
//    public static void main(String[] args) {
//        int[] arr = {1, 2, 6, 4, 5, 7};
//
//        int index = findOutOfOrder(arr);
//
//        if (index != -1) {
//            System.out.println("Out of order index: " + index);
//            System.out.println("Out of order element: " + arr[index]);
//        } else {
//            System.out.println("Array is sorted");
//        }
//    }
//
//    public static int findOutOfOrder(int[] arr) {
//        int left = 0;
//        int right = arr.length - 1;
//
//        while (left < right) {
//            int mid = (left + right) / 2;
//
//            // check violation
//            if (arr[mid] > arr[mid + 1]) {
//                return mid;
//            }
//
//            // decide direction
//            if (arr[mid] >= arr[left]) {
//                left = mid + 1;   // go right
//            } else {
//                right = mid;      // go left
//            }
//        }
//
//        return -1; // no violation found
//    }
//}

//24/4/26
//ascending order
//package target.gt;
//
//import java.util.Arrays;
//
//public class hh {
//public static void bubble(int arr[]){
//	for(int i=0;i<arr.length;i++) {
//		for(int j=0;j<arr.length-i-1;j++) {
//			if(arr[i]>arr[j+1]) {
//				int temp=arr[j];
//				arr[j]=arr[j+1];
//				arr[j+1]=temp;
//			}
//		}
//	}
//}
//public static void main(String[] args) {
//	int arr[]= {5,6,7,9,4,8,2};
//	bubble(arr);
//	System.out.println(Arrays.toString(arr));
//	
//}
//}

//descending order
//--------------------
//bubble sort
//package target.gt;
//
//import java.util.Arrays;
//
//public class hh {
//public static void bubble(int arr[]){
//	for(int i=0;i<arr.length;i++) {
//		for(int j=0;j<arr.length-i-1;j++) {
//			if(arr[i]<arr[j+1]) {
//				int temp=arr[j];
//				arr[j]=arr[j+1];
//				arr[j+1]=temp;
//			}
//		}
//	}
//}
//public static void main(String[] args) {
//	int arr[]= {1,2,3,4,5,6};
//	bubble(arr);
//	System.out.println(Arrays.toString(arr));
//}
//}

//package target.gt;
//
//import java.util.Arrays;
//
//public class hh {
//	public static void main(String[]args) {
//		int arr[]= {1,2,3,4,5,6};
//		boolean swapped;
//		for(int i=0;i<arr.length;i++) {
//			swapped=false;
//	     for(int j=0;j<arr.length-i-1;j++) {
//	    	 if(arr[i]>arr[j+1]) {
//					int temp=arr[j];
//					arr[j]=arr[j+1];
//					arr[j+1]=temp;
//					swapped=true;
//	     }
//			
//		}
//	     if(!swapped) {
//	    	 break;
//	     }
//	}
//		System.out.println(Arrays.toString(arr));
//}
//}

//package target.gt;
//import java.util.Arrays;
//
//public class hh {
//    public static void main(String[] args) {
//
//        int arr[] = {1,2,3,4,5,6};
//        boolean swapped;
//        int count = 0;   //  swap count
//
//        for(int i = 0; i < arr.length - 1; i++) {
//            swapped = false;
//
//            for(int j = 0; j < arr.length - i - 1; j++) {
//
//                if(arr[j] > arr[j+1]) {   // ascending
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//
//                    count++;   //  swap jarigindi
//                    swapped = true;
//                }
//            }
//
//            if(!swapped) {
//                break;
//            }
//        }
//
//        System.out.println(Arrays.toString(arr));
//        System.out.println("Swaps = " + count);
//    }
//}


//------------------------
//selection sort
//package target.gt;
//
//import java.util.Arrays;
//
//public class hh{
//	public static void selection(int arr[]) {
//		for(int i=0;i<arr.length;i++) {
//			int min_index=i;
//			for(int j=i+1;j<arr.length;j++) {
//				if(arr[j]<arr[min_index]) {
//					min_index=j;
//				}
//			}
//			int temp=arr[min_index];
//			arr[min_index]=arr[i];
//			arr[i]=temp;
//			
//		}
//	}
//	public static void main(String[] args) {
//		int arr[]= {4,6,2,9,7,3,1};
//		selection(arr);
//		System.out.println(Arrays.toString(arr));
//	}
//}
//------------------------
//insertion sort
//import java.util.Arrays;
//
//public class hh {
//
//    public static void insertion(int arr[]) {
//        for(int i = 1; i < arr.length; i++) {
//            int key = arr[i];
//            int j = i - 1;
//
//            // shift elements
//            while(j >= 0 && arr[j] > key) {
//                arr[j + 1] = arr[j];
//                j--;
//            }
//
//            // insert key
//            arr[j + 1] = key;
//        }
//    }
//
//    public static void main(String[] args) {
//        int arr[] = {4, 6, 2, 9, 7, 3, 1};
//
//        insertion(arr);
//
//        System.out.println(Arrays.toString(arr));
//    }
//}

package target.gt;


import java.util.Arrays;

public class hh{
	public static void mergeSort(int arr[],int noofEle) {
		if(noofEle<2) {
			return;
		}
		
		int mid=noofEle/2;
		int leftArr[]=new int[mid];
		int rightArr[]=new int[noofEle-mid];
		
		for(int i=0;i<mid;i++) {
			rightArr[i-mid]=arr[i];
			
		}
		mergeSort(leftArr,mid);
		mergeSort(rightArr,noofEle-mid);
		merge(arr,leftArr, rightArr,mid,noofEle-mid);
		
	}

	private static void merge(int[] arr, int[] leftArr, int[] rightArr, int left, int right) {
		// TODO Auto-generated method stub
		int i=0,j=0,k=0;
		while(i<left && j<right) {
			if(leftArr[i]<=rightArr[j]) {
				arr[k++]=leftArr[i++];
				
			}else {
				arr[k++]=rightArr[j++];
			}
			while(i<left) {
				arr[k++]=leftArr[i++];
				
			}
			while(j<right) {
				arr[k++]=rightArr[j+1];
			}
		}
	}
	    public static void main(String[] args)
	    {
	    	int arr[]= {7,3,8,1,2,6,9,5};
	    	mergeSort(arr,8);
	    	System.out.print(Arrays.toString(arr));
	    
	    }
	 }





































