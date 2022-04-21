import java.util.Scanner;
public class Quit{

public static void main(String[] args) {
	int sum=0,sumEven=0,sumOdd=0,number,Odd=0,Even=0;

	Scanner sc=new Scanner(System.in);

	while(true)
	 {
		System.out.println("Enter any numbr:(TYpe quit to stop program)");

		number = sc.nextInt();

		if (number>0 && number%2==0) 
		{
			sumEven+=number;
			Even++;
		}
		if (number<0 && number%2!=0) 
			{
				sumOdd+=number;
				Odd++;	
			}
		if (charAt=="quit")

			break;
	 }
	System.out.println("totle positive Even Number:"+Even);
	System.out.println("totle negative Odd Number:"+Odd);

	System.out.println("sum of positive even number:"+sumEven);
    System.out.println("sum of negative odd number:"+sumOdd);
	}
}
