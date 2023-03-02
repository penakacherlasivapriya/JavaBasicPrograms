package beginner;

import java.util.Scanner;

public class LargestOfThreeNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A value");
		int a= sc.nextInt();
		System.out.println("Enter B value");
		int b= sc.nextInt();
		System.out.println("Enter C value");
		int c= sc.nextInt();
		
		if(a>b && a>c) {
			System.out.println("A is the largest number"+a);
		}
		else if(b>a && b>c) {
			System.out.println("B is the largest number"+b);
		}
		else {
			System.out.println("C is the largest number"+c);
		}
	}

}
