//Write a program to convert temperature from Fahrenheit to Celsius. (Formula : c =f - 32*5/9)
	

import java.util.Scanner;

	  public class FahtoCal {

    public static void main(String[] args) {

        float c, f;

        System.out.println("Enter celsius value =");
        Scanner sc = new Scanner(System.in);

        c = sc.nextFloat();

        f = (c * 9 / 5) + 32;

        System.out.println("Fahrenheit =" + f);
        c = (f - 32) * 5 / 9;

        System.out.println("Celsius = " + c);

    }
}

