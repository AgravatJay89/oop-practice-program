//Write a program to find that given number is palindrome or not.

import java.util.Scanner;
public class NoPalindrom{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number:");
		int n1 = sc.nextInt();
		int n2=n1,rem,rev=0;
		while(n1!=0){
			rem=n1%10;
			rev=rev*10+rem;
			n1=n1/10;
		}
		if(n2==rev){System.out.println("palindrom number");}
		else{System.out.println("not palindrom number");}
	}
}