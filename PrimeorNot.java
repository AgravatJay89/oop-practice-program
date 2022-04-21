//Write a program to check that the given number is prime or not.
import java.util.Scanner;
public class PrimeorNot{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter any number:");
		float a = sc.nextFloat();

		 int flag=0;

		for(int i=2;i<a;i++)
		{
			if (a%i==0) 
			{
				flag=1;
				break;
			}
		}
		if (flag==0) 
		{
			System.out.println("---Number is Prime---" +a);
		}
		else
		{
			System.out.println("---Number is not Prime---"+a);
		}


	}
}
