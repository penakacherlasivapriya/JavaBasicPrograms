package beginner;

import java.util.Scanner;

public class ReverseStringUsingStringBuffer {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter string value");
		String str=sc.next();
		
		StringBuffer sb=new StringBuffer(str);
		StringBuffer reverse=sb.reverse();
		
		System.out.println("Reverse string is"+reverse);
		
	}

}
