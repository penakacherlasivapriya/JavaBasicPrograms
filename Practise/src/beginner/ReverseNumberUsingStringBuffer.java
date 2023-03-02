package beginner;

import java.util.Scanner;

public class ReverseNumberUsingStringBuffer {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int num= sc.nextInt();
		
		StringBuffer sb= new StringBuffer(String.valueOf(num));
		
		StringBuffer reverse=sb.reverse();
		System.out.println("Reverse number is" + reverse);
	}

}
