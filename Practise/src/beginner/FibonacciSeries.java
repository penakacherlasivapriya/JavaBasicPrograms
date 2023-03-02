package beginner;

import java.util.Scanner;

// 0 1  1 2 3 5 8 13 21 34

public class FibonacciSeries {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int sum=0;;
		int n1=0;
		int n2=1;
		System.out.println(n1+""+n2); // 0 1
		
		for(int i=2;i<=num;i++) {
			sum=n1+n2;               // 1  2  3  5
			System.out.println(sum);
			n1=n2;   // 1   1   2   3
			n2=sum;  // 1   2   3   5
		}
	}

}
