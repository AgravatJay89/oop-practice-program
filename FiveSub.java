  /*if-else ladders1. The marks obtained by a student in 5 different subjects are input through the keyboard. 
The student gets a division as per the following rules:
a. Percentage above or equals to 60-first division
b. Percentage between 50 to 59-second division
c. Percentage between 40 and 49-Third division
d. Percentage less than 40-fail
Write a program to calculate the division obtained by the student.*/

import java.util.*;

public class FiveSub{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("enter a mark of first subject:");
        int a = sc.nextInt();

        System.out.print("enter a mark of second subject:");
        int b = sc.nextInt();

        System.out.print("enter a mark of tihrd subject:");
        int c = sc.nextInt();

        System.out.print("enter a mark of fourth subject:");
        int d = sc.nextInt();

        System.out.print("enter a mark of fifth subject:");
        int e = sc.nextInt();

        double sum=(a+b+c+d+e);
        System.out.println("Totle"+sum);

        double avg=sum/5;
        System.out.println("Percentage"+avg);

        if (avg>=60) 
        {
            System.out.println("First Division");   
        }
         else if (avg<59 && avg>50)
         {
            System.out.println("Second Division");
         }
         else if (avg<49 && avg>40) 
         {
             System.out.println("Third Division");
         }
         else if (avg<40) 
         {
             System.out.println("Fail");
         }
         else
         {
            System.out.println("Invalid Input");
         }
}}



