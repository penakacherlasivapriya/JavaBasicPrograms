package beginner;

import java.util.Scanner;

public class ReverseStringUsingCharArray {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter string value");
		String str=sc.next();
		String reverse="";
		char a[]=str.toCharArray();
		int length=a.length;
		
		for(int i=length-1;i>=0;i--) {
			reverse=reverse+a[i];
		}
		System.out.println("Reverse value of string is"+reverse);
	}

}
