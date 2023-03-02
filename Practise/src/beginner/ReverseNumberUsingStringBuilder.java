package beginner;

import java.util.Scanner;

public class ReverseNumberUsingStringBuilder {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		StringBuilder sb= new StringBuilder();
		sb.append(num);
		StringBuilder reverse=sb.reverse();
		System.out.println("Reverse number is"+reverse);
	}

}
