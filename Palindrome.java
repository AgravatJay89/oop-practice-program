//Write a program to find that given number or string is palindrome or not.

import java.util.*;
	public class Palindrome{
		public static void main(String[] args) 
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter String:-");
			String str= sc.next();
			String em="";
			for(int i=str.length()-1;i>=0;i--)
			{
				em+=str.charAt(i);
			}
			if(em.equals(str))
			{
				System.out.println("string is Palindrome"+em);
			}else{
				System.out.println("string is not Palindrome"+em);
			}
			//System.out.println(em);

		}
	}

	/*

	


