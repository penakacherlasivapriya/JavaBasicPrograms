package beginner;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
	//using concatenation operator
	//	String str="ABCD";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String value");
		String str=sc.next();
		String reverse="";
		int length=str.length();
		
		for(int i=length-1;i>=0;i--) {
			reverse=reverse+str.charAt(i);
		}
		System.out.println("Reverse string is"+reverse);
	}

}
