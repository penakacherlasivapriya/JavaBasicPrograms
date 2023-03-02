package beginner;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int original_num=num;
		int reverse=0;
		while(num!=0) {
			reverse=reverse*10+num%10;
			num=num/10;
		}
		if(original_num==reverse) {
			System.out.println(original_num+"is a palindrome");
		}
		else {
			System.out.println(original_num+"is not a palindrome");
		}
		
	}

}
