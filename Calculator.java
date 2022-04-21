import java.util.*;
class Calculator
{
	public static void main(String[] args)
	{
		Scanner j=new Scanner(System.in);

		System.out.println("enter a value of x:");
		float x=j.nextFloat();
		System.out.println("enter a value of y:");
		float y=j.nextFloat();

		System.out.println("select your choice:");
		System.out.println("1=addition");
		System.out.println("2=subtraction");
		System.out.println("3=multiplication");
		System.out.println("4=division");
		int choice=j.nextInt();

		if (choice==1) 
		{
			float sum=x+y;
			System.out.println("addition="+sum);
		}

		 else if (choice==2) 
		{
			float sub=x-y;
			System.out.println("substraction="+sub);
		}

		else if (choice==3) 
		{
			float mult=x*y;
			System.out.println("multiplication="+mult);
		}

		else 
		{
			float sum=x/y;
			System.out.println("division="+sum);
		}




	}
}