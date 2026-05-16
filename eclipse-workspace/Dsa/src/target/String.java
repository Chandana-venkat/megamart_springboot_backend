//174/25
//package target;
//import java.util.Scanner;
//public class String {
//	public static void main(String[] args){
//		int n=0;
//		String arr[]= new String[n];
//		
//		Scanner sc= new Scanner(System.in);
//		for(int i=0;i<arr.length;i++) {
//		  	
//		
//		System.out.println(arr[i]+ " ");	
//		}
//		
//	//enhanced for loop
////       for(String st:arr)
////        {
////	        System.out.println(st+ " ");
////          }
//    }
//}

package target;

import java.util.Scanner;

public class String{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=0;
		int arr[]= {12,89,37,81,73};
		int position=2;
		int element=77;
		int newArr[]=new int[arr.length+1];
		for(int i=0;i<position;i++) {
			newArr[i]=arr[i];
			
			}
		newArr[position]=element;
		for(int i=position;i<arr.length;i++) {
			newArr[position+1]=arr[i];
		}
		for(int el:newArr) {
			System.out.println(el+ " ");
		}
		
	}
}