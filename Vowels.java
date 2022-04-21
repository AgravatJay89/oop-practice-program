//Write a program to accept a line and check how many consonants and vowels are there in line.

import java.util.Scanner;
public class Vowels{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("enter any string");
		String str =sc.nextLine();
		int vowel=0,conso=0,res=0,con=0,count=0;
		
		for(int i=0;i<=str.length()-1;i++){
 			count++;
 			if(str.charAt(i)==' '){
 				res++;
 				
 				//conso--;
 			}
 			if(str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' || str.charAt(i)=='U' || str.charAt(i)=='O' ||
 				str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='u' || str.charAt(i)=='o')
 		{

 			vowel++;
 		}
 		else{
 			conso++;	
 		con = conso-res;
 		}

 		}
 		System.out.println("count is="+count);
 			System.out.println("consonant="+con);
 			System.out.println("vowels ="+vowel);

			System.out.println("Totle Space Betwwen Word="+res);
 		

	}
}


//#G//
