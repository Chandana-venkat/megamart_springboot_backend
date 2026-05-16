//package target;
//
//public class SumDemo {
//	public static int sumDemo(int n) {
//		if(n==0) {
//			return 0;
//		}
//		return n%10+sumDemo(n/10);
//		
//	}
//	public static void main(String[] args) {
//		System.out.println(sumDemo(123411));
//	}
//
//}
//output 12
package target;

public class SumDemo {
    public static int fiborec(int n) {   // ❗ removed ;
        if(n <= 1) {
            return n;
        }
        return fiborec(n - 1) + fiborec(n - 2);
    }

    public static void main(String[] args) {
    
        System.out.println(fiborec(5));
    }
}

