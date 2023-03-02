package beginner;

import java.util.Scanner;

public class PalindromeString {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter string value");
		String str=sc.next();
		String original_string=str;
		
		String reverse="";
		int length=str.length();
		for(int i=length-1;i>=0;i--) {
			reverse=reverse+str.charAt(i);
		}
		if(original_string.equals(reverse)) {
			System.out.println(original_string+"is a palindrome");
		}
		else {
			System.out.println(original_string+"is not a palindrome");
		}
	}

}
