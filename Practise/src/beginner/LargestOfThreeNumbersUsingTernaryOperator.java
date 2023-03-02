package beginner;

import java.util.Scanner;

public class LargestOfThreeNumbersUsingTernaryOperator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A value");
		int a= sc.nextInt();
		System.out.println("Enter B value");
		int b= sc.nextInt();
		System.out.println("Enter C value");
		int c= sc.nextInt();
		
		int largest=c>(a>b?a:b)?c:(a>b?a:b);
		System.out.println("Largest number is"+largest);
	}

}
